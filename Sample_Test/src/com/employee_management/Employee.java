package com.employee_management;

import java.util.Scanner;
public class Employee extends Person {
        int id;
        String department;
        double salary;
        MyDate doj;
        
	   public Employee() {
			
		}

		public Employee(String Name,MyDate dob,int id, String department, double salary, MyDate doj) {			
			super(Name,dob);
			this.id = id;
			this.department = department;
			this.salary = salary;
			this.doj = doj;
		}

		public void setData(Scanner sc)
		{
			super.setData(sc);			
			System.out.println("Enter The Date of Joining Format(DD-MM-YYYY):");	
			doj=new MyDate();			
		    try {
				doj.setDate(sc);
			} catch (InvalidYearException e) {
				e.printStackTrace();
			}
			
		
			
			System.out.println("Enter the Employee id:");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Department of Employee:");
			department=sc.nextLine();
			System.out.println("Enter the Salary of Employee:");
			salary=sc.nextDouble();
			
		}
		
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public double getSalary() {
			return salary;
		}
		

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public MyDate getDoj() {
			return doj;
		}

		public void setDoj(MyDate doj) {
			this.doj = doj;
		}

		@Override
		public String toString() {
			return super.toString()+"\n Employee id=" + id + "\n department=" + department + "\n salary=" + salary + "\n date of joining=" + doj ;
		}
		
		
		
        
}
