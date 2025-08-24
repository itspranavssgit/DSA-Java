package com.employee_management;

import java.util.Scanner;
class InvalidYearException extends Exception{
	
	public InvalidYearException() {
		
	}
	public InvalidYearException(String message) {
		super(message);
	}
	
}
public class MyDate {
          int date;
          int month;
          int year;
          
          public MyDate() {
        	  
          }
		  public MyDate(int date, int month, int year) {
			this.date = date;
			this.month = month;
			this.year = year;
		  }
		  public void setDate(Scanner sc) throws InvalidYearException
		  {
			  System.out.println("Enter Date:");
			  date=sc.nextInt();
			  sc.nextLine();
			  System.out.println("Enter Month:");
			  month=sc.nextInt();
			  sc.nextLine();			  
			 System.out.println("Enter Year:");
			  year=sc.nextInt();
			  sc.nextLine();
			  if(year<2000 ||year >2025 )
				  throw new InvalidYearException("Year is not Acceptable");
			  
		  }
		  
		  
		  public int getDate() {
			return date;
		}
		  public void setDate(int date) {
			  this.date = date;
		  }
		  public int getMonth() {
			  return month;
		  }
		  public void setMonth(int month) {
			  this.month = month;
		  }
		  public int getYear() {
			  return year;
		  }
		  public void setYear(int year) {
			  this.year = year;
		  }
		  @Override
		  public String toString() {
			return date + "/" +month +"/"+ year;
		  }
		  
         
		  
          
}
