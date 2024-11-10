/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digitalcalc;

/**
 *
 * @author elnei
 */
import java.util.Scanner;

public class DigitalCalc {
    public static void main(String[] args) {
        Scanner sc 
                = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digitalRoot = calculateRoot(number);
        System.out.println("Sum of digits until single digit: " + digitalRoot);
        sc.close();
    }

    public static int calculateRoot(int number) {
        // Using a while loop
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return number;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        // Using a for loop
        for (char digit : String.valueOf(number).toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum;
    }
}
