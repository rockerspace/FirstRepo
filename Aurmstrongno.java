package com.excelon.app;

import java.util.Scanner;

public class Aurmstrongno
 
{

 public static void main(String[] args)
 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    static
 
boolean isArmstrong(int n) {
        int originalNum = n;
        int sum = 0;
        int digits = 0;

        // Count the number of digits
        while (originalNum != 0) {
            originalNum /= 10;
            digits++;
        }

        originalNum = n;

        // Calculate the sum of each digit raised to the power of the number of digits
        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, digits);
            originalNum /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == n;
    }
}