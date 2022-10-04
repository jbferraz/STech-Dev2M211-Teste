/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jairb
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    /**
     * Test of mult method, of class Calculadora.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        double v1 = 2.0;
        double v2 = 2.0;
        Calculadora instance = new Calculadora();
        Double expResult = 4.0;
        Double result = instance.mult(v1, v2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
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
        Double expResult = 3.0;
        Double result = instance.soma(v1, v2);
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
        Double expResult = 2.0;
        Double result = instance.sub(v1, v2);
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
        Double expResult = 4.0;
        Double result = instance.div(v1, v2);
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
