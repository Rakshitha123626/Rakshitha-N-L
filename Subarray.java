package com.acharya.classes;
import java.util.Scanner;

public class Subarray {

	
		// TODO Auto-generated method stub
		
		

		    // Method to return subarray
		    public static int[] subArray(int[] arr, int start, int end) {

		        int size = end - start + 1;
		        int[] result = new int[size];

		        int index = 0;

		        for (int i = start; i <= end; i++) {
		            result[index] = arr[i];
		            index++;
		        }

		        return result;
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the size of the array: ");
		        int size = sc.nextInt();

		        int[] arr = new int[size];

		        System.out.println("Enter the array elements:");
		        for (int i = 0; i < size; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.print("Enter start index: ");
		        int start = sc.nextInt();

		        System.out.print("Enter end index: ");
		        int end = sc.nextInt();

		        // call method
		        int[] result = subArray(arr, start, end);

		        // print subarray
		        System.out.println("Subarray:");
		        for (int value : result) {
		            System.out.print(value + " ");
		        }

		        sc.close();
		    }
		


	}


