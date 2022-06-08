/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf2.aillament;

import examenuf2.aillament.GestorOfertes;
import java.util.Date;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bernat
 */
public class GestorOfertesTest {
    
    public GestorOfertesTest() {
    }

    /**
     * Test of getInformeDisponibilitat method, of class GestorOfertes.
     */
    @Test
    public void testGetInformeDisponibilitat() {
        
        GestorOfertes go = new GestorOfertes();
        String informe = go.getInformeDisponibilitat(12, new Date(2018, 8, 13), new Date(2018, 8, 15));
        
        String expected = "HOTEL NH Igualada\n"+
            "\tHab(372):LLIURE, Doble, 89.0€/nit\n"+
            "\tHab(445):OCUPADA, Suite, 189.0€/nit\n"+
            "\tHab(921):LLIURE, Triple, 120.0€/nit\n";
        
        System.out.println(">"+informe+".");
        System.out.println(">"+expected+".");
        
        Assert.assertEquals(expected, informe);
        
    }
    
}
