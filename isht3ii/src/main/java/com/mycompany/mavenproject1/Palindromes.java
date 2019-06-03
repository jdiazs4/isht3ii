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
