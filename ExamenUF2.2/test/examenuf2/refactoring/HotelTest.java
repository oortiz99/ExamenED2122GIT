/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf2.refactoring;

import examenuf2.refactoring.Habitacio;
import examenuf2.refactoring.Hotel;
import examenuf2.refactoring.RegimEnum;
import examenuf2.refactoring.Estansa;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bernat
 */
public class HotelTest {
    
    public HotelTest() {
    }


    /**
     * Test of getFacturacio method, of class Hotel.
     */
    @Test
    public void testGetFacturacio() {
        
        Hotel nh = new Hotel();
        nh.addEstansa(new Estansa(new Habitacio(666,Habitacio.DOBLE),new Date(2018,3,25), new Date(2018,3,28),2, RegimEnum.MITJA_PENSIO));
        nh.addEstansa(new Estansa(new Habitacio(333,Habitacio.TRIPLE),new Date(2018,3,10), new Date(2018,3,11),2, RegimEnum.PENSIO_COMPLETA));
        nh.addEstansa(new Estansa(new Habitacio(601,Habitacio.DOBLE),new Date(2018,3,25), new Date(2018,3,28),1, RegimEnum.NOMES_ALLOTJAMENT));
        nh.addEstansa(new Estansa(new Habitacio(100,Habitacio.SUITE),new Date(2018,3,26), new Date(2018,3,27),1, RegimEnum.PENSIO_COMPLETA));
        nh.addEstansa(new Estansa(new Habitacio(301,Habitacio.TRIPLE),new Date(2018,3,25), new Date(2018,3,28),1, RegimEnum.ESMORCAR));
        nh.addEstansa(new Estansa(new Habitacio(303,Habitacio.TRIPLE),new Date(2018,3,23), new Date(2018,3,29),3, RegimEnum.ESMORCAR));
        
        String facturacio = nh.getFacturacio();
        System.out.println(""+facturacio+".");
        
        //----------------------------------------
        String expected = "> Facturació pendent: \n"+
        "	-666:(doble+MP),	 nits d'estança:3,	 preu total 335.0€ \n"+
        "	-333:(triple+PC),	 nits d'estança:1,	 preu total 260.0€ \n"+
        "	-601:(doble+SA),	 nits d'estança:3,	 preu total 305.0€ \n"+
        "	-100:(suite+PC),	 nits d'estança:1,	 preu total 670.0€ \n"+
        "	-301:(triple+AD),	 nits d'estança:3,	 preu total 450.0€ \n"+
        "	-303:(triple+AD),	 nits d'estança:6,	 preu total 750.0€ \n"+
        "=========================================================\n"+
        " Total dobles:	640.0€ \n"+
        " Total triples:	1460.0€ \n"+
        " Total suites:	670.0€ \n"+
        "=========================================================\n"+
        " Total:	2770.0€ \n"+
        "=========================================================\n";
        System.out.println("\n********************************************************\n");
        System.out.println(""+expected+".");
        
        Assert.assertEquals(expected, facturacio);

    }


}
