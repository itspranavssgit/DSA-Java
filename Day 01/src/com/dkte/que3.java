package com.dkte;

import java.util.*;
public class que3 {

	public static void main(String[] args) {
		int rows = 10;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
				}
			for(int k=1;k<2*i;k++) {
				System.out.print("*");
				System.out.print(" ");
 
			}
			System.out.println();
		}
	

	}

}