package com.dkte3;

import java.util.Scanner;

public class Palindrome {

	public void Logic(Scanner sc)
	{
		String s;
		System.out.println("Enter the String: ");
		s=sc.next();
		
		StringBuffer sb1= new StringBuffer(s);
		String a=sb1.reverse().toString();
		if(a.equals(s)) {
			System.out.println("It is Palindrome.");
		}else {
			System.out.println("It is not Palindrome.");
		}
		
}
}
