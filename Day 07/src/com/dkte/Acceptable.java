 package com.dkte;

import java.util.Scanner;

 interface Acceptable {
 void accept(Scanner sc);
}
 interface Displayable extends Acceptable{
	 void Display();
 }
 interface another extends Acceptable{
	 void input();
 }
 
 
 class Date implements Acceptable,Displayable,another{
    int Day;
	int Month;
	int Year;
	
	@Override
	public void accept(Scanner sc) {
		System.out.println("Day:");
		Day= sc.nextInt();
		System.out.println("Month");
		Month=sc.nextInt();
		System.out.println("Year:");
		Year=sc.nextInt();
	}

	@Override
	public void Display() {
		System.out.println("Day is:"+Day);
		System.out.println("Month is:"+Month);
		System.out.println("Year"+Year);
	}

	@Override
	public void input() {
		System.out.println("input::Date");
	}
	
}
 class Employee extends Date implements Acceptable , Displayable{

	@Override
	public void Display() {
		System.out.println("Day is:"+Day);
		System.out.println("Month is:"+Month);
		System.out.println("Year"+Year);
	}

	@Override
	public void accept(Scanner sc) {
		System.out.println("Day:");
		Day= sc.nextInt();
		System.out.println("Month");
		Month=sc.nextInt();
		System.out.println("Year:");
		Year=sc.nextInt();
	}
	 
 }
 
 
 
 
 
 
 

