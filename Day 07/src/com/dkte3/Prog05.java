package com.dkte3;

import java.util.Scanner;

public class Prog05 {

	public static void main(String[] args) {
		int n;
		int d;
		
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter The Numerator:");
			n=sc.nextInt();
			System.out.println("Enter the Denominator:");
			d=sc.nextInt();
			int result=n/d;
			System.out.println("Result:"+result);
        }finally {
        	System.out.println("Inside Finally");
        	sc.close();
        }

	}

}
