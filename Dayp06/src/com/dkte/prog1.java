package com.dkte;

import java.util.Scanner;

public class prog1 {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Employee e1= new Employee();
		e1.accept(sc);
		e1.display();
		
		Employee e;
		e= new SalesMan();
		e.accept(sc);
		e.display();
	}

}
