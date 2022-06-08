package examenuf2.aillament;

/**
 *
 * @author bernat
 */
class DadesHabitacio {

    private int codi;
    private TipusHabitacio tipusHabitacio;
    private double preu;
    private boolean disponible;

    public DadesHabitacio(int codi, TipusHabitacio tipusHabitacio, double preu, boolean disponible) {
        this.codi = codi;
        this.tipusHabitacio = tipusHabitacio;
        this.preu = preu;
        this.disponible = disponible;
    }

    
    public int getCodi() {
        return codi;
    }

    public TipusHabitacio getTipusHabitacio() {
        return tipusHabitacio;
    }

    public double getPreu() {
        return preu;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
}
