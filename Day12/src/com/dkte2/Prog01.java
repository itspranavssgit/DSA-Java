package com.dkte2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Prog01 {

	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<>();
		q1.add(10);
		q1.offer(20);
		q1.add(30);
		q1.offer(40);

		System.out.println("Element at front - " + q1.peek());
		System.out.println("Element at front - " + q1.element());
        System.out.println("Elements:"+q1.remove());
//	q1.poll();
//	q1.remove();
//	q1.remove();
//	q1.poll();
//
//		q1.poll();
//	q1.remove();

		System.out.println("After remove,Element at front - " + q1.peek());
		// System.out.println("After remove,Element at front - " + q1.element());

	}

}

