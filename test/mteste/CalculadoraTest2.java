/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mteste;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jairb
 */
public class CalculadoraTest2 {

    private Calculadora calc;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testMult() {
        System.out.println("Teste Mult");
        Double resultEsperado = 4.0;
        Double result = calc.mult(2.0, 2.0);
        assertEquals(resultEsperado, result);
    }

    @Test
    public void testMultError() {
        System.out.println("Teste Mult Err");
        assertNotEquals(4.0, calc.mult(1.0, 2.0), 0.01);
    }

    @Test
    public void testSoma() {
        System.out.println("Teste Soma");
        assertEquals(3.0, calc.soma(1.0, 2.0), 0.001);
    }

    @Test
    public void testSub() {
        System.out.println("Teste Sub");
        assertEquals(0.0, calc.sub(2.0, 2.0), 0.01);
    }

    @Test
    public void testDiv() {
        System.out.println("Teste Divisão");
        assertEquals(1.66, calc.div(5.0, 3.0), 0.01);
    }
    
    @Test
    public void testNumPar(){
        System.out.println("Teste NumPar");
        assertTrue(calc.numPar(4));
    }
    
    @Test
    public void testNumImpar(){
        System.out.println("Teste NumImpar");
        assertFalse(calc.numPar(3));
    }
    
    @Test
    public void testAreaQ(){
        System.out.println("Teste areaQ");
        assertEquals(100, calc.areaQ(10));
    }
    
    @Test
    public void testRaizQuad(){
        System.out.println("Raiz");
        assertEquals(4, calc.raiz(16, 2));
    }
    
    @Test
    public void testRaizCub(){
        System.out.println("Raiz");
        assertEquals(3, calc.raiz(27, 3));
    }
    
    @Test
    public void testExp(){
        System.out.println("Exp");
        assertEquals(8, calc.exp(2, 3));
    }
}



