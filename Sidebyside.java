package com.acharya.classes;

import java.util.Scanner;

public class Sidebyside {

	public  static void PrintSidebySide(int arr[]) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++)
			if (arr[i] == arr[i + 1])
				count++;

		System.out.println("output:" + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Array elements are");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Sidebyside.PrintSidebySide(arr);
	}

}
