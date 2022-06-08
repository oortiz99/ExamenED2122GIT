
package examenuf2.refactoring;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bernat
 */
public class Hotel {
    
    private List<Estansa> mEstancesActuals = new ArrayList<Estansa>();
    

    public void addEstansa(Estansa e){
        mEstancesActuals.add(e);
    }
    
    public String getFacturacio(){
        
        double totalImports=0;
        double totalDobles=0, totalTriples=0, totalSuites=0;
        double preu;
        StringBuilder sb = new StringBuilder();
        sb.append("> Facturació pendent: \n");
        for(int i=0;i<mEstancesActuals.size();i++) {
            Estansa e = mEstancesActuals.get(i);
            String regim;
            switch(e.getRegim()){
               case ESMORCAR: regim="AD";break;
               case MITJA_PENSIO: regim="MP";break;
               case PENSIO_COMPLETA: regim="PC";break;
               default: regim="SA";break;
           }
            if(e.getHabitacio().getTipusHabitacio()==Habitacio.DOBLE) {
                
                int nitsDiff = nitsDiferencia( e.getDiaEntrada(), e.getDiaSortida()) ;
                preu = nitsDiff * 85;
                        
                if(e.getNumeroPersones()==1) { // rec?rrec per us individual
                    preu += 50;
                }

                switch(e.getRegim()){
                    case ESMORCAR: preu+=10*e.getNumeroPersones();break;
                    case MITJA_PENSIO: preu+=40*e.getNumeroPersones();break;
                    case PENSIO_COMPLETA: preu+=70*e.getNumeroPersones();break;
                }
                totalDobles+= preu;
                totalImports+=preu;
                sb.append("\t-"+e.getHabitacio().getCodi()+":(doble+"+regim+"),\t nits d'estança:"+nitsDiff+",\t preu total "+preu+"€ \n");        
                        
            } else if(e.getHabitacio().getTipusHabitacio()==Habitacio.TRIPLE) {
                int nitsDiff = nitsDiferencia( e.getDiaEntrada(), e.getDiaSortida()) ;
                preu = nitsDiff * 120;
                        
                if(e.getNumeroPersones()==1) { // rec?rrec per us individual
                    preu += 80;
                }
                switch(e.getRegim()){
                    case ESMORCAR: preu+=10*e.getNumeroPersones();break;
                    case MITJA_PENSIO: preu+=40*e.getNumeroPersones();break;
                    case PENSIO_COMPLETA: preu+=70*e.getNumeroPersones();break;
                }
                sb.append("\t-"+e.getHabitacio().getCodi()+":(triple+"+regim+"),\t nits d'estança:"+nitsDiff+",\t preu total "+preu+"€ \n");        
                totalTriples+= preu;  
                totalImports+=preu;
            } else {
                int nitsDiff = nitsDiferencia( e.getDiaEntrada(), e.getDiaSortida()) ;
                preu = nitsDiff * 600;
                
                switch(e.getRegim()){
                    case ESMORCAR: preu+=10*e.getNumeroPersones();break;
                    case MITJA_PENSIO: preu+=40*e.getNumeroPersones();break;
                    case PENSIO_COMPLETA: preu+=70*e.getNumeroPersones();break;
                }
                totalImports+=preu;
                totalSuites+= preu;                  
                sb.append("\t-"+e.getHabitacio().getCodi()+":(suite+"+regim+"),\t nits d'estança:"+nitsDiff+",\t preu total "+preu+"€ \n");    
            }            
        }
        sb.append("=========================================================\n");        
        sb.append(" Total dobles:\t"+totalDobles+"€ \n");    
        sb.append(" Total triples:\t"+totalTriples+"€ \n");    
        sb.append(" Total suites:\t"+totalSuites+"€ \n");    
        sb.append("=========================================================\n");        
        sb.append(" Total:\t"+totalImports+"€ \n");    
        sb.append("=========================================================\n");        

        
        return sb.toString();
    }
    
    public static int nitsDiferencia( Date a, Date b) {
        Calendar cala = Calendar.getInstance();
        cala.setTime(a);
        Calendar calb = Calendar.getInstance();
        calb.setTime(b);
         long millis1 = cala.getTimeInMillis();
        long millis2 = calb.getTimeInMillis();

        // Calculate difference in milliseconds
        long diff = millis2 - millis1;
        return  (int)Math.ceil(diff / (24 * 60 * 60 * 1000));
    }
    
}
