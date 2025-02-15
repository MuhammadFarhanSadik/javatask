
package com.mycompany.dmsirtasklab;

import java.util.Scanner;

public class Find_largest_among_three_numbers_DMSIRS {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.println("ENTER THREE NUMBERS:");
        
        // Declare variables to hold the three numbers
        double num1, num2, num3;

        // Read the first number from the user
        num1 = input.nextDouble();
        
        // Read the second number from the user
        num2 = input.nextDouble();
        
        // Read the third number from the user
        num3 = input.nextDouble();
        
        // Determine which number is the largest
        if (num1 >= num2 && num1 >= num3) {
            // If num1 is greater than or equal to both num2 and num3, print that num1 is the largest
            System.out.println("num1 largest");
        } else if (num2 >= num1 && num2 >= num3) {
            // If num2 is greater than or equal to both num1 and num3, print that num2 is the largest
            System.out.println("num2 largest");
        } else {
            // If neither num1 nor num2 is the largest, then num3 must be the largest
            System.out.println("num3 largest");
        }
    }
}
