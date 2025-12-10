package com.acharya.classes;

import java.util.Scanner;

public class StudentObject {
	int id;
	String name;
	int marks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Students ");
		int n = sc.nextInt();
		StudentObject[] Student = new StudentObject[n];
		for (int i = 0; i < n; i++) {
			Student[i] = new StudentObject();
			System.out.println("Enter the Student Details " + (i + 1));
			System.out.println("id:");
			Student[i].id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name");
			Student[i].name = sc.nextLine();
			System.out.println("Marks");
			Student[i].marks = sc.nextInt();
		}
		System.out.println(" Student Details");
		for (int i = 0; i < n; i++) {
			System.out.println("\n Student "+(i+1));
			System.out.println("ID: " + Student[i].id);
			System.out.println("Name" + Student[i].name);
			System.out.println("Marks" + Student[i].marks);

		}
		sc.close();
	}
}
