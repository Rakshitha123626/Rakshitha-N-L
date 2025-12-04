package com.acharya.classes;
import java.util.Scanner;
public class Searchusingmethod {

	
		// TODO Auto-generated method stub
		public static void searchNumber(int[] arr, int num) {

	        boolean found = false;

	        for (int element : arr) {
	            if (element == num) {
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println(num + " is present in the array.");
	        } else {
	            System.out.println(num + " is NOT present in the array.");
	        }
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

	        System.out.print("Enter the number to search: ");
	        int num = sc.nextInt();

	        // Calling the user-defined method
	        searchNumber(arr, num);

	        sc.close();
	    }
	

	}


