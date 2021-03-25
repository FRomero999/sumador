/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumador;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author paco
 */
public class SumadorTest {
    
    public SumadorTest() {
    }
    
    /**
     * Test of getResultado method, of class Sumador.
     */
    @org.junit.jupiter.api.Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Sumador instance = new Sumador(0);
        Integer expResult = 0;
        Integer result = instance.getResultado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setResultado method, of class Sumador.
     */
    @org.junit.jupiter.api.Test
    public void testSetResultado() {
        System.out.println("setResultado");
        Integer resultado = 10;
        Sumador instance = new Sumador(resultado);
        assertEquals(instance.getResultado(),resultado);
    }

    /**
     * Test of sumar method, of class Sumador.
     */
    @org.junit.jupiter.api.Test
    public void testSumar() {
        System.out.println("sumar");
        Integer cantidad = 20;
        Sumador instance = new Sumador(10);
        instance.sumar(cantidad);
        assertEquals(instance.getResultado(),30);
    }

    /**
     * Test of reset method, of class Sumador.
     */
    @org.junit.jupiter.api.Test
    public void testReset() {
        System.out.println("reset");
        Sumador instance = new Sumador(10);
        instance.reset();
        assertEquals(instance.getResultado(),0);        
    }
    
}
