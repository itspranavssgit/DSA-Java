package com.dkte3;

import java.util.Scanner;

public class Prog06 {

	public static void main(String[] args) {
		int n;
		int d;
		
		try(Scanner sc= new Scanner(System.in);) {
			System.out.println("Enter the Numerator:");
			n=sc.nextInt();
			System.out.println("Enter the Denominator:");
			d=sc.nextInt();
			int result = n/d;
			System.out.println("Result"+result);
		}
		System.out.println("Program Finished......");

	}

}
