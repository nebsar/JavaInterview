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
public class CounterGame {
    
    static int setBits(long n) {
        int count = 0 ;
        while(n > 0) {
            n &= (n-1) ;
            count ++ ;
        }
    return count ;
    }
    
    static String counterGame(long n) {
        return (setBits(n-1) & 1) == 1 ? "Louise" : "Richard";
    }
    
    public static void main(String[] args) {
        
        System.out.println(counterGame(6));
        
    }
    
}
