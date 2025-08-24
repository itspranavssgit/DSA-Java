package com.carpooling;

import java.util.Scanner;

class CarCal
{
	int tot_miles;
	double avg_miles_per_Gal,cost_per_Gal,park_fees,tolls_per_day;
	Scanner sc=new Scanner(System.in);
    public CarCal() 
    {
		
	}
	
	
	
	
	public CarCal(int tot_miles, double avg_miles_per_Gal, double cost_per_Gal, double park_fees, double tolls_per_day,
			Scanner sc) {
		super();
		this.tot_miles = tot_miles;
		this.avg_miles_per_Gal = avg_miles_per_Gal;
		this.cost_per_Gal = cost_per_Gal;
		this.park_fees = park_fees;
		this.tolls_per_day = tolls_per_day;
		this.sc = sc;
	}




	void inputInfo()
	{
		System.out.println("Enter the Total miles driven per day:");
		tot_miles=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Cost per gallon of gasoline:");
		cost_per_Gal=sc.nextDouble();
		
		System.out.println("Enter Average miles per gallon:");
		avg_miles_per_Gal=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Parking fees per day:");
		park_fees=sc.nextDouble();
		
		System.out.println("Enter Tolls per day:");
		tolls_per_day=sc.nextDouble();
		
	}
    
	double calCostPerDay()
	{
	  return (((tot_miles/avg_miles_per_Gal)*cost_per_Gal)+park_fees+tolls_per_day);	
	}
	
	void display()
	{
		System.out.println("The Total miles driven per day:"+tot_miles);
				
		System.out.println("Cost per gallon of gasoline:"+cost_per_Gal);
		
		System.out.println("Average miles per gallon:"+avg_miles_per_Gal);
		
		System.out.println("Parking fees per day:"+park_fees);
		
		System.out.println("Tolls per day:"+tolls_per_day);
		
	}
	
}


public class Qn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             CarCal c=new CarCal();
             c.inputInfo();
             c.display();
             System.out.println("the user’s cost per day of driving to work is:"+c.calCostPerDay());
	}

}
