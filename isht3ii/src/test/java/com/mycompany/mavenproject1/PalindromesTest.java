/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joan Diaz
 */
public class PalindromesTest {
    
    public PalindromesTest() {
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

    @Test
    public void PruebaVariablesPar() {
        System.out.println("TEST #1 - VARIABLES PARES");
        
        //given
        String word = "12aa21";
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromes.evaluate(word);
        
        //then
        assertEquals("TEST #1 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void PruebaVariablesImpar() {
        System.out.println("TEST #2 - VARIABLES IMPARES");
        
        //given
        String word = "ana";
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromes.evaluate(word);
        
        //then
        assertEquals("TEST #2 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void PruebaCadenaVacia() {
        System.out.println("TEST #3 - CADENA VACIA");
        
        //given
        String word = "";
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromes.evaluate(word);
        
        //then
        assertEquals("TEST #3 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void PruebaCadenaExtensa() {
        System.out.println("TEST #4 - CADENA EXTENSA");
        
        //given
        String word = "abcdefghijklmnopqrstuvwxyz1zyxwvutsrqponmlkjihgfedcba";
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromes.evaluate(word);
        
        //then
        assertEquals("TEST #4 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void PruebaCadenaUnitaria() {
        System.out.println("TEST #5 - CADENA UNITARIA");
        
        //given
        String word = "j";
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromes.evaluate(word);
        
        //then
        assertEquals("TEST #5 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void PruebaCaracteresEspeciales() {
        System.out.println("TEST #6 - CARACTERES ESPECIALES");
        
        //given
        String word = "a/d?<?d/a";
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromes.evaluate(word);
        
        //then
        assertEquals("TEST #6 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void PruebaCadenaNula() {
        System.out.println("TEST #7 - CADENA NULA");
        
        //given
        String word = null;
        boolean resultadoEsperado = false;
        
        //when
        boolean resultadoObtenido = Palindromes.evaluate(word);
        
        //then
        assertEquals("TEST #7 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void PruebaPalabrasEspacio() {
        System.out.println("TEST #8 - PALABRAS SEPARADAS POR ESPACIO");
        
        //given
        String word = "dabale arroz a la zorra el abad";
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = Palindromes.evaluate(word);
        
        //then
        assertEquals("TEST #8 FAILED!",resultadoEsperado, resultadoObtenido);
    }
}
