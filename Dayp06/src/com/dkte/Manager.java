package com.dkte;

import java.util.Scanner;

public class Manager extends Employee {
	double Bonus;
	
	public Manager(int empid,double salary,double Bonus) {
		super(empid, salary);
		this.Bonus=Bonus;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the Bonus:"+Bonus);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("The bonus is:"+Bonus);
	}
	
	
	

}
