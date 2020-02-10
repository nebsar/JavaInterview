/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author EagleEye
 */
public class FlippingBits {
    
    public static void main(String[] args) {
        long n = 10;
        String str = String.format("%32s", Long.toBinaryString(n)).replaceAll(" ", "0");
        
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '0')
                charArray[i] = '1';
            else
                charArray[i] = '0';        
        }
        
        str = String.valueOf(charArray);
        
        System.out.println(Long.parseLong(str, 2));
        
    }
    
}
