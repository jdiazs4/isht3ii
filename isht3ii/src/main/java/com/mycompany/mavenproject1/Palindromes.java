/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Joan Diaz
 */
public class Palindromes {
    public static void main(String args[]){
        String word = null;
        boolean resultado= false;
        
        //EJEMPLO 1 - PALABRAS
        word = "malayalam";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 2 - PALABRAS
        word = "sometemos";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 3 - PALABRAS
        word = "reconocer";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 4 - FRASES
        word = "ali tomo tila";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 5 - FRASES
        word = "amo la pacifica paloma";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 6 - FRASES
        word = "eva usaba rimel y le miraba suave";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 7 - NUMEROS
        word = "1234567890987654321";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 8 - NUMEROS
        word = "2002";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 9 - CARACTERES ESPECIALES 
        word = "?/.,*-+o+-*,./?";
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
        
        //EJEMPLO 10 - NULO
        word = null;
        resultado = evaluate(word);
        System.out.println("Probando: " + word + " - Resultado: " + resultado);
    }
    
    public static boolean evaluate(String word) {
    if (word == null) 
      return false;
    
    boolean result = true;
    word = word.replace(" ", "");
    int length = word.length();
    
    
    for (int i = 0; i < length / 2; i++) {
      if (word.charAt(i) != word.charAt(length - 1 - i)) {
        result = false;
        break;
      }
    }
    return result;
  }  
}
