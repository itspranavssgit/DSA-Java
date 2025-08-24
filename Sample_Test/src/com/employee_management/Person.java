package com.employee_management;

import java.util.Scanner;

public class Person {
         String name;
         MyDate dob;
		 public Person() {
			
		 }
		 public Person(String name, MyDate dob) {		
			this.name = name;
			this.dob = dob;
		 }
		 
		 public void setData(Scanner sc)
		 {
			 System.out.println("Enter the name:");
			 sc.nextLine();
			 name=sc.nextLine();
			 System.out.println("Enter The Date of birth in Format(DD-MM-YYYY):");
			 dob=new MyDate();
			 try {
				dob.setDate(sc);
			} catch (InvalidYearException e) {
				e.printStackTrace();
			}
		 }
		 
	
		 
		 @Override
		 public String toString() {
			return "\nPerson name="+name +"\ndate of birth="+dob;
		 }
		 public String getName() {
			 return name;
		 }
		 public void setName(String name) {
			 this.name = name;
		 }
		 public MyDate getDob() {
			 return dob;
		 }
		 public void setDob(MyDate dob) {
			 this.dob = dob;
		 }
		 
         
}
