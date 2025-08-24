package com.dkte;


import java.util.Scanner;

public class que1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int number = scanner.nextInt();
		
		System.out.println("Enter the Given Number:"+number);
		
		System.out.println("The Binary equivalent:"+ Integer.toBinaryString(number));
		System.out.println("The Octal equivalent:"+ Integer.toOctalString(number));
		System.out.println("The Hexadecimal equivalent:"+ Integer.toHexString(number));

	}

}
