/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digitalcalc;

/**
 *
 * 
 */
import java.util.Scanner;

public class DigitalCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        do {
            int sum = 0;
            int temp = num; // Temporary variable to store the value of num

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            num = sum; // Update num to be the sum of its digits
        } while (num > 9);

        System.out.println("Sum of digits until single digit: " + num);
    }
}
