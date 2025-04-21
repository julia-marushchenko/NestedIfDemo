// Java program to demonstrate nested if
package com.conditions;

import java.util.Random;

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        // Local variable with random value
        int number = new Random().nextInt();

        if(number < 25){

            System.out.println("Number is smaller than 25");

            // First if statement
            if(number < 20){

                System.out.println("Number is smaller than 20");

                // Second if statement, will be executed only if statement above is true
                if(number < 15){

                    System.out.println("Number is smaller than 15 too");
                }
            }

        } else {
            System.out.println("Number is greater than 25");
        }

        // Printing the value of number
        System.out.println("Number = " + number);
    }
}