
package com.mycompany.dmsirtasklab;

import java.util.Scanner;

public class Sum_DMSIRS {
    public static void main(String[] args) {
        // Prompt the user to enter two numbers
        System.out.print("PLEASE ENTER TWO NUMBERS:");
        
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Read the first number from the user
        double num1 = input.nextDouble();
        
        // Read the second number from the user
        double num2 = input.nextDouble();
        
        // Calculate the sum of the two numbers
        double sum = num1 + num2;
        
        // Print the numbers entered by the user with two decimal places
        System.out.printf("\n YOU HAVE ENTERED %.2f and %.2f", num1, num2);
        
        // Print the result of the sum
        System.out.println("\n YOUR RESULT IS:" + sum);
    }
}