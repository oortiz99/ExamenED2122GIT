package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public class Habitacio {

    public static final int DOBLE = 0 ;
    public static final int TRIPLE = 1;
    public static final int SUITE = 2;
    
    
    private int codi;
    private int tipusHabitacio;

    public Habitacio(int codi, int tipusHabitacio) {
        this.codi = codi;
        this.tipusHabitacio = tipusHabitacio;
    }

    public int getCodi() {
        return codi;
    }

    public int getTipusHabitacio() {
        return tipusHabitacio;
    }

    
}
