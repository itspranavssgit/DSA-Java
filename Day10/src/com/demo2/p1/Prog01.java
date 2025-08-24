package com.demo2.p1;

public class Prog01 {

	public static <T> void displayArray(T[] arr) {
		System.out.println();
		for(T element :arr)
			System.out.println("Element-"+element);
	}
	
	public static void main(String[] args) {
		Integer arr[]= {10,20,30,40,50};
		displayArray(arr);
		Double[] arr2=
	}
}
