package com.acharya.classes;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows ");
		int rows = sc.nextInt();
		System.out.println("Enter the Number of columns ");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		System.out.println("Enter the array elements ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		
		int count1to50 = 0;
		int count50to100 = 0;
		int countAbove100 = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				if (arr[i][j] >= 1 && arr[i][j] <= 50)
					count1to50++;

				else if (arr[i][j] > 50 && arr[i][j] <= 100)
					count50to100++;

				else if (arr[i][j] > 100)
					countAbove100++;
			}
		}

		System.out.println("\nResults:");
		System.out.println("There are " + count1to50 + " numbers between 1 to 50");
		System.out.println("There are " + count50to100 + " numbers between 50 to 100");
		System.out.println("There are " + countAbove100 + " numbers above 100");

	}
}
