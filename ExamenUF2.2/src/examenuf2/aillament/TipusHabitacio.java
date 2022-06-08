/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf2.aillament;

/**
 *
 * @author bernat
 */
public enum TipusHabitacio {
    DOBLE("Doble"),
    TRIPLE("Triple"),
    SUITE("Suite");
    
    String desc;

    TipusHabitacio(String desc) {
        this.desc = desc;
    }
    
}
