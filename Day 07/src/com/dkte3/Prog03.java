package com.dkte3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog03 {

public static void main(String[] args) {
int n;
int d;
Scanner sc=new Scanner(System.in);
		
	try {
		System.out.println("Enter The numerator:");
		n= sc.nextInt();
		System.out.println("Enter the Denominator:");
		d=sc.nextInt();
		
		int result= n/d;
		System.out.println("Result"+result);
		    
	}catch(ArithmeticException e) {
		System.out.println("Cannot divide 0...");
	}catch(InputMismatchException e) {
		System.out.println("Enter the Correct Input:");
	}
	System.out.println("Programm Fineshedd.....");
	}




}
