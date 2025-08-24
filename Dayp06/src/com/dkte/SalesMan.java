package com.dkte;

import java.util.Scanner;

public class SalesMan extends Employee {
	double Commission;
	int NoOfProducts;
	
	public SalesMan() {
		
	}
	public SalesMan(int empid,double Salary,double Commision,int noOfProducts) {
		super(empid, Salary);
		this.Commission=Commission;
		this.NoOfProducts=NoOfProducts;
		
	}
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the commision:"+Commission);
		Commission=sc.nextDouble();
		System.out.println("Enter the no of products:");
		NoOfProducts=sc.nextInt();
		
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Commission is: "+Commission);
		System.out.println("No of products:"+NoOfProducts);
	}
	
	

}
