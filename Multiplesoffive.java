package com.acharya.classes;

import java.util.Scanner;

public class Multiplesoffive {

	 
		// TODO Auto-generated method stub
		 static void printMultiples(int arr[]) {
		        int count = 0;

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] % 5 == 0) {
		                count++;
		            }
		        }

		        System.out.println("Output: " + count);
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter array size: ");
		        int n = sc.nextInt();

		        int arr[] = new int[n];

		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }


		        printMultiples(arr); // calling method
		    }
		

	}


