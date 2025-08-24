package com.dkte3;

public class Prog02 {

	public static void main(String[] args) {
		int n=10;
		int d=0;
		try {
			int result = n/d;
			System.out.println("Result"+result);
		}catch(ArithmeticException e) {
			System.out.println("Can not divided by zero");
		}
System.out.println("Finished.....");
	}

}
