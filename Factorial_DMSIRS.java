
package com.mycompany.dmsirtasklab;

import java.util.Scanner;

public class Factorial_DMSIRS {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("please Enter a number:");
        
        // Read the integer input from the user
        int num = input.nextInt();
        
        // Declare a variable to hold the factorial result
        int i;
        int factorial = 1; // Initialize factorial to 1 (as factorial of 0 is 1)

        // Calculate the factorial using a for loop
        for (i = 1; i <= num; i++) {
            factorial *= i; // Multiply factorial by the current value of i
        }
        
        // Print the result of the factorial calculation
        System.out.println("factorial is:" + factorial);
    }
}