
package com.mycompany.dmsirtasklab;

import java.util.Scanner;

public class Even_Odd_DMSIRS {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an integer number
        System.out.print("PLEASE ENTER A Integer NUMBER:");
        
        // Read the integer number entered by the user
        int num = input.nextInt();
        
        // Print the number entered
        System.out.printf("\nYOUR NUMBER IS :%d", num);
        
        // Check if the number is even
        if (num % 2 == 0) {
            System.out.printf("\nYOUR NUMBER(%d) IS Even. ", num);
        } 
        // Check if the number is zero
        else if (num == 0) {
            System.out.printf("\nYOUR NUMBER IS(%d) IS ZERO", num);
        } 
        // If it's neither even nor zero, then it is odd
        else {
            System.out.printf("\nYOUR NUMBER(%d) IS Odd. ", num);
        }
    }
}