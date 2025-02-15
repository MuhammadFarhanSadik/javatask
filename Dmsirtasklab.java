

package com.mycompany.dmsirtasklab;
import java.util.Scanner;

public class Dmsirtasklab {
  
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner Input = new Scanner(System.in);
        
        // Declare variables to store student information
        String name;
        long ID;
        int AGE;
        float Fees;
        char Grade;

        // Prompt the user to enter student details
        System.out.print("STUDENT NAME:");
        name = Input.nextLine();

        System.out.print("STUDENT ID:");
        ID = Input.nextInt();

        System.out.print("STUDENT AGE:");
        AGE = Input.nextInt();

        System.out.print("STUDENT FEES:");
        Fees = Input.nextFloat();

        System.out.print("STUDENT GRADE:");
        Grade = Input.next().charAt(0);
                
        // Display the student information
        System.out.println(name);
        System.out.println(ID);
        System.out.println(AGE);
        System.out.println(Fees);
        System.out.println(Grade);
    }
}
// Press Shift + F11 to build
// Press Shift + F6 to run