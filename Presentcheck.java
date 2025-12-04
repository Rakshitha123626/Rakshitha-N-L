package com.acharya.classes;
import java.util.Scanner;

public class Presentcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is present in the array.");
        } else {
            System.out.println(search + " is NOT present in the array.");
        }

        sc.close();
    }


	}


