package com.dkte2;

public class Prog03 {

	public static void main(String[] args) {
		String s1 = "dkte";
		String s2 = new String("dkte");

		StringBuilder sb1 = new StringBuilder("dkte");
		StringBuilder sb2 = new StringBuilder("dkte");

		System.out.println("s1 == s2 - " + (s1 == s2));
		System.out.println("s1.equals(s2) - " + (s1.equals(s2)));

		System.out.println("sb1 == sb2 - " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) - " + (sb1.equals(sb2)));
	}
}
