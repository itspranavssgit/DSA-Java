package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc,int opt)
	{
		System.out.println("Enter the Option:");
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Apple");
		System.out.println("3.Add Orange");
		System.out.println("4.Display Fruits");
		System.out.println("5.Display Information of Fruit");
		System.out.println("6.Keeping Fruit to be stale");
		System.out.println("7.Display which fruit are stale   ");		
		opt=sc.nextInt();
		sc.nextLine();
		return opt;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int counter=0;
         Fruit []basket=new Fruit[5];
         int opt=0,si=0;
         while((opt=menu(sc,opt))!=0)
         {
        	    switch(opt)
        	    {
        	      case 1:
          	    	  if(basket[counter]==null)
         	    	  {
        	    		     basket[counter]=new Mango();
      	    	         basket[counter].setFruit();
      	    	         counter++;
         	    	  }
        	    		break;
        	      case 2:
         	    	  if(basket[counter]==null)
         	    	  {
        	    		    basket[counter]=new Apple();
      	    	        basket[counter].setFruit();
      	    	        counter++; 	    		  
        	     	  }
        	    	         break;
        	      case 3:
        	     	  if(basket[counter]==null)
        	     	  {
        	    	     	 basket[counter]=new Orange();
      	    	         basket[counter].setFruit();
      	    	         counter++;
        	     	  }
        	    	      break;
        	      case 4:
        	    	        for(int i=0;i<basket.length;i++)
        	    	        {
        	    	        	   if(basket[i]!=null)        	
        	    	        		   System.out.println("The fruit is:"+basket[i].nm);        	    	
        	    	        }
        	    	        break;
        	      case 5:
        	    	        for(int i=0;i<basket.length;i++)
        	    	        {    
     	    	        	    if(basket[i]!=null)
     	    	        	    {
     	    	        	    	 System.out.println("The fruit information is:"+basket[i].toString());
     	    	        	    	 System.out.println("The fruit taste is:"+basket[i].taste());     	    	        	    	 
     	    	        	    }     	
     	    	        	    System.out.println();
        	    	        }
        	    	        break;
        	      case 6:
        	    	         System.out.println("Enter the which Fruit to set stale:");
        	    	         si=sc.nextInt();
        	    	         while(true)
        	    	         {
        	    	        	   if(si<=basket.length)
        	    	        	       break;
        	    	        	   else
        	    	        		   System.out.println("Invalid Input please Enter again");
        	    	         }
        	    	         basket[si].setIsFresh();
        	    	         break;
        	      case 7:
        	    	  System.out.println("The taste of Stale Fruits are");       
        	    	  for(int i=0;i<basket.length;i++)
        	    	         {
        	    	        	     if(basket[i]!=null)
        	    	        	     {
         	    	        	    	 if(basket[i].getisFresh()==false)
         	    	        	    	 {
         	    	        	    		 System.out.println("The Fruit is:"+basket[i].nm);
         	    	        	    		 System.out.println("The Taste is:"+basket[i].taste());
          	    	        	    	 }
        	    	         	}
        	    	         }
        	    	         break;
        	    	  default:
        	    		     System.out.println("Invalid Input:(");
           	    }
         }
         
	}

}
