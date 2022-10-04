/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mteste;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author jairb
 */
public class CalculadoraNGTest {
    
    public CalculadoraNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of soma method, of class Calculadora.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        double v1 = 1.0;
        double v2 = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 3.0;
        double result = instance.soma(v1, v2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Calculadora.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        double v1 = 3.0;
        double v2 = 1.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.sub(v1, v2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        double v1 = 8.0;
        double v2 = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 4.0;
        double result = instance.div(v1, v2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of numPar method, of class Calculadora.
     */
    @Test
    public void testNumPar() {
        System.out.println("numPar");
        int n = 2;
        Calculadora instance = new Calculadora();
        Boolean expResult = true;
        Boolean result = instance.numPar(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of areaQ method, of class Calculadora.
     */
    @Test
    public void testAreaQ() {
        System.out.println("areaQ");
        int lado = 10;
        Calculadora instance = new Calculadora();
        int expResult = 100;
        int result = instance.areaQ(lado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of raiz method, of class Calculadora.
     */
    @Test
    public void testRaiz() {
        System.out.println("raiz");
        int radicando = 16;
        int indice = 2;
        Calculadora instance = new Calculadora();
        int expResult = 4;
        int result = instance.raiz(radicando, indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testRaizCub(){
        System.out.println("raizCub");
        Calculadora c = new Calculadora();
        assertEquals(3, c.raiz(27, 3));
    }

    /**
     * Test of exp method, of class Calculadora.
     */
    @Test
    public void testExp() {
        System.out.println("exp");
        int v = 2;
        int exp = 3;
        Calculadora instance = new Calculadora();
        int expResult = 8;
        int result = instance.exp(v, exp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
