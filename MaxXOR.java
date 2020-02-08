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
public class MaxXOR {
    
    static int maximizingXor(int l, int r) {
        int maxOutput = 0;
        for(int i = l ; i <= r ; i++){
            for (int j = l ; j <= r ; j++){
                    int currentOutPut = i ^ j;
                    if (maxOutput < currentOutPut){
                        maxOutput = currentOutPut;
                }
            }
        }
      
        return maxOutput;
    }
    
    public static void main(String[] args) {
           int number = maximizingXor(11, 100);
           System.out.println(number);
    }
    
}
