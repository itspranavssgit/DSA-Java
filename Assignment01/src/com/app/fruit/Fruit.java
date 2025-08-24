package com.app.fruit;

import java.util.Scanner;

public class Fruit {
	  String nm;
      String color;
      double weight;
      String name;
      private boolean isFresh;
      Scanner sc=new Scanner(System.in);
      public Fruit() {
    	     nm="";
         color="";
         weight=0.0;
         name="";
         isFresh=true;
  	  }
      
      
	  public Fruit(String nm,String color, double weight, String name, boolean isFresh) {
		
		this.nm= nm;
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	  }
	  
	 public void setIsFresh()
	 {
		 this.isFresh=false;
	 }
	 
	 public boolean getisFresh()
	 {
		 return this.isFresh;
	 }
	 
	  
      
	  public void setFruit()
	  {
		  System.out.println("Enter Name of Fruit");
		  nm=sc.nextLine();
		  System.out.println("Enter Colour of Fruit");
		  color=sc.nextLine();
		  
		  System.out.println("Enter Weight of Fruit");
		  weight=sc.nextDouble();
		  sc.nextLine();
	  }
	  
	  @Override
	  public String toString()
	  {
		  return "\nColour:"+color+"\n Weight:"+weight;
	  }
	 
	  public String taste()
	  {
		 return "no specific taste"; 	  
	  }
}
	  

