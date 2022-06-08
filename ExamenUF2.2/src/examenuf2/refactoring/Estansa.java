
package examenuf2.refactoring;

import java.util.Date;

/**
 *
 * @author bernat
 */
public class Estansa {

    private Habitacio habitacio;
    private Date diaEntrada;
    private Date diaSortida;
    private int numeroPersones;
    private RegimEnum regim;

    public Estansa(Habitacio habitacio, Date diaEntrada, Date diaSortida, int numeroPersones, RegimEnum regim) {
        this.habitacio = habitacio;
        this.diaEntrada = diaEntrada;
        this.diaSortida = diaSortida;
        this.numeroPersones = numeroPersones;
        this.regim = regim;
    }

    public Habitacio getHabitacio() {
        return habitacio;
    }

    public Date getDiaEntrada() {
        return diaEntrada;
    }

    public Date getDiaSortida() {
        return diaSortida;
    }

    public int getNumeroPersones() {
        return numeroPersones;
    }

    public RegimEnum getRegim() {
        return regim;
    }

    
}
