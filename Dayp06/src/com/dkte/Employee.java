package com.dkte;

import java.util.Scanner;

public class Employee {
	int empid;
	double Salary;
	
	public Employee() {
		
	}
	public Employee(int empid,double Salary) {
		this.empid=empid;
		this.Salary=Salary;
		}
	public void accept(Scanner sc) {
		System.out.println("Enter The Empid"+empid);
		empid=sc.nextInt();
		System.out.println("Enter the Salary");
		Salary=sc.nextDouble();
	}
	public void display() {
		System.out.println("Empid is:"+empid);
		System.out.println("Salary is:"+Salary);
	}

}
