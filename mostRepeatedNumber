package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author EagleEye
 */
public class MostRepeated {
    
    
    
    public static void main(String[] args){
           

        ArrayList a = new ArrayList();

        Random random = new Random();

        for(int i=0; i<10; i++){
            int number = random.nextInt((10 - 0) + 1) + 0;
            a.add(number);
        }

        HashMap h = new HashMap();
        
        int maxNumberCount = 1;
        
        int maxNumber = 0;
        
        for (int i =0; i<a.size(); i++){
            int currentNumber = (int) a.get(i);
            
            if (h.get(currentNumber) == null){
                h.put(currentNumber, 1);
            } else {
                int numCount = (int)h.get(currentNumber) + 1;
                h.put(currentNumber, numCount);
                if (maxNumberCount < numCount){
                    maxNumberCount = numCount;
                    maxNumber = currentNumber;
                }
            }
        } 
        
        System.out.println(maxNumber + " is repeated " + maxNumberCount + " times");
    }
    
    
}
