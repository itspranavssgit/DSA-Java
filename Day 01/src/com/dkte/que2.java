package com.dkte;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first No.:");
		if(!sc.hasNextDouble() || sc.hasNextInt()) {
			System.out.println("Invalid first  no.");
			return;
		}
		double D1=sc.nextDouble();
		System.out.println("Enter the second no.:");
		if(!sc.hasNextDouble() || sc.hasNextInt()) {
			System.out.println("Invalid secomd no.");
			return; 
		}
		double D2=sc.nextDouble();
		double avg = D1+D2/2.0;
		System.out.println("the avg is two no. is: "+ avg);
		
	}

}