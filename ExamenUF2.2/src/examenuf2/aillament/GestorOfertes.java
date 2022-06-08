package examenuf2.aillament;

import java.util.Date;
import java.util.List;

/**
 *
 * @author bernat
 */
public class GestorOfertes {

    public GestorOfertes(){
                
    }
    
    public String getInformeDisponibilitat( int codiHotel, Date dataEntrada, Date dataSortida) {
        
        StringBuilder sb = new StringBuilder();
        MotorReserves motor = new MotorReserves();
        List<Integer> localitzadorsHabitacio = motor.getLocalitzadors(codiHotel);
        
        sb.append("HOTEL " + motor.getNomHotel(codiHotel) + "\n");
        
        for( int codiLocalitzador:localitzadorsHabitacio) {
            DadesHabitacio dh = motor.getInfoHabitacio(codiLocalitzador, dataEntrada, dataSortida);
        
            sb.append("\tHab(" + dh.getCodi() +"):"+ (dh.isDisponible()?"LLIURE":"OCUPADA" )+", "+ dh.getTipusHabitacio().desc +", "+ dh.getPreu() + "€/nit" + "\n");    
            
        }
        return sb.toString();
    }
            
}
