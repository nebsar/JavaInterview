package com.mycompany.mavenproject2;

/**
 *
 * @author EagleEye
 */
public class FlipString {
    
    
    public static void main(String[] args) {
        String str = "deneme";
        char[] charStr = str.toCharArray();
        int last = charStr.length -1;
        int lnght = last / 2;
        int i = 0;
        while(i <= lnght){
            char tempStr = charStr[i];
            charStr[i] = charStr[last];
            charStr[last] = tempStr;
            i += 1;
            last -= 1;
        }
        
        str = String.valueOf(charStr);
        
        System.out.println(str);
        
    }
    
}
