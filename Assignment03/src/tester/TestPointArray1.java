package tester;
import java.util.Scanner;

import com.app.geometry.*;


public class TestPointArray1 {
	
	  public static int menu(Scanner sc,int opt)
	  {
		  System.out.println("0.Exit");
		  System.out.println("1. Enter points:");
		  System.out.println("2. Display details of a specific point");
		  System.out.println("3.Display x, y co-ordinates of all points");
		  System.out.println("4.Calculate Distance");
		  opt=sc.nextInt();
		  return opt;
			 			 
	  }
	
      public static void main(String [] args) {	  
    	  int ptno;
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the no of points to be included:");
    	  ptno=sc.nextInt();
    	  Point2D[]points=new Point2D[ptno];
    	  int opt = 0;
    	  while((opt=menu(sc,opt))!=0)
    	  {
    		switch(opt)
    		{
    		  case 1:
    			     for(int i=0;i<points.length;i++)
    			     {
    			    	    if(points[i]==null)
    			    	    {
    			    	    	   System.out.println("Enter x co-ordinate:");
    			    	    	   int x=sc.nextInt();
    			    	    	   System.out.println("Enter y co-ordinate:");
    			    	    	   int y=sc.nextInt();
    			    	    	   points[i]=new Point2D(x, y);     			    	    	   
    			    	    }
    			     }
    			      break;
    		  case 2:
   			   System.out.println("Enter the index of point to be whose co-ordinates to be displayed");
   			   int indx=sc.nextInt();
   			   if(points[indx]!=null)
   			   {
   				   System.out.println(points[indx].getDetails());   				   
   			   }
   			   else
   				   System.out.println("Invalid index , pls retry!!!!");
   			   break;
    		  case 3:
    			  for(Point2D p:points)
    			  {
    				  if(p!=null)
    				  System.out.println(p.getDetails());
    			  }
    			  break;
    		  case 4:
    			  System.out.println("Enter the index for starting index");
    			  int si=sc.nextInt();
    			  sc.nextLine();
    			  System.out.println("Enter the index for Ending index");
    			  int ei=sc.nextInt();
    			  if(!points[ei].isEqual(points[si]))
    				  System.out.println("The distance between two points are:"+points[ei].calculateDistance(points[si]));
    		    	 else
    		    		 System.out.println("Both points are on same position Try another");
    		    		
    			  break;
    		  default:	
    			   System.out.println("Invalid Input :(");
    		}
    	  }
	}
	  
}
