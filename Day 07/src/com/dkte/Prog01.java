package com.dkte;

import java.util.Scanner;

public class Prog01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Acceptable a1;
		a1=new Date();
		a1.accept(sc);
		
		Displayable d= (Displayable)a1;
		d.Display();
		
		another a= (another)a1;
		a.input();
		
		
	}

}
