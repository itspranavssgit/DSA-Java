package com.app.geometry;

public class Point2D {
	   double x,y; 
       public Point2D(double x,double y)
       {
    	       this.x=x;
    	       this.y=y;    	   
       }
        
      public double calculateDistance(Point2D p)
      {
    	      double varn=Math.pow((this.y-p.y), 2)+Math.pow(this.x-p.x,2);
    	      return Math.sqrt(varn);
      }


     


	   public boolean isEqual(Point2D p)
       {
    	       if(this.x==p.x && this.y==p.y)
    	    	     return true;
    	       else
    	    	    return false;
       }
       
       public String getDetails() 
       {
    	      String str=x+" "+y;   
    	      return str; 	      
    	   }
       
}


