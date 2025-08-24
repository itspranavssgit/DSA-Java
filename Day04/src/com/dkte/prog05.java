package com.dkte;

import java.util.Scanner;

public class prog05 {

	public static int menu(Scanner sc) {
		System.out.println("--------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Display Student");
		System.out.println("3. Find Student");
		System.out.print("Enter your choice - ");
		int choice = sc.nextInt();
		System.out.println("--------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		int index = 0;
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if (index < 5) {
					arr[index] = new Student();
					arr[index].acceptStudent();
					index++;
				} else
					System.out.println("Course is full");
				break;
			case 2:
				for (Student s : arr)
					if (s != null)
						s.displayStudent();
				break;
			case 3:
				for (Student s : arr)
					if (s != null)
						// To-DO
						break;
			default:
				System.out.println("Wrong choice.. :(");
				break;
			}
		}

	}

}
