/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import calculator.CalculatorBean;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JHONATAN
 */
public class Prueba {
    
    public Prueba() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSuma()
    {
        System.out.println("suma");
        int a = 4;
        int b = 3;
        CalculatorBean instance = new CalculatorBean();
        int expResult = Integer.parseInt("7");
        instance.setParam1(a);
        instance.setParam2(b);
        String result = instance.add();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
       @Test
    public void testResta()
    {
        System.out.println("Resta");
        int a = 4;
        int b = 3;
        CalculatorBean instance = new CalculatorBean();
        int expResult = Integer.parseInt("1");
        instance.setParam1(a);
        instance.setParam2(b);
        String result = instance.substract();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    // public void hello() {}
}
