package com.dkte1;

import java.util.Stack;

public class Prog03 {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(10);
		s1.push(20);
		s1.push(30);

		System.out.println("element at the top - " + s1.peek());
		s1.pop();
		System.out.println("After pop, element at the top - " + s1.peek());
	}

}