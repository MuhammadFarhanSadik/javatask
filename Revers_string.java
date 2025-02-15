
package com.mycompany.dmsirtasklab;


public class Revers_string {
    public static void main(String[] args) {
        
        // Original string to be reversed
        String ogStr = "CSE124";
        
        // Variable to hold the reversed string
        String reversedStr = "";

        // Loop through each character of the original string
        for (int i = 0; i < ogStr.length(); i++) {
            // Add the current character to the front of the reversed string
            reversedStr = ogStr.charAt(i) + reversedStr;
        }

        // Print the reversed string
        System.out.println("Reversed string: "+ reversedStr);
    }
}