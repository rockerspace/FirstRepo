package Excelon.day3.app1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int num = s.nextInt();

   
        int[][] table = new int[num][num];

     
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                table[i][j] = (i + 1) * (j + 1); 
            }
        }

        System.out.println("Multiplication Table:");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.printf("%4d", table[i][j]); 
            System.out.println(); 
        }
    }

	}

}
