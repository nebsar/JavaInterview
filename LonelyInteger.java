/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.io.*;
import java.util.*;

public class LonelyInteger {

    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] a) {
        
        HashMap h = new HashMap();

        for (int i =0; i< a.length; i++){
            int currentNumber = a[i];

            if(h.get(currentNumber)==null){
                h.put(currentNumber, 1);
            } else {
                int numCount = (int)h.get(currentNumber) + 1;
                h.put(currentNumber, numCount);
            }

        }

        Object[] oArray = h.keySet().toArray();
        int onlyOnce =0;

        for (int i =0; i< oArray.length; i++){
            int count = (int) h.get((int)oArray[i]);
            if (count == 1){
                onlyOnce = (int)oArray[i];
            }
        }
        
        return onlyOnce;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
