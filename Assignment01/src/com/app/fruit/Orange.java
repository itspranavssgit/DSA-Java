package com.app.fruit;

public class Orange extends Fruit {
	
	  public Orange()
      {
    	      super();
    	      System.out.println("Orange");
    	      
      }
	
	
      public Orange(String nm,String color, double weight, String name, boolean isFresh)
      {
    	      super(nm,color,weight,name,isFresh);
    	      System.out.println("Orange");
    	      
      }

      public String getFruitName()
      {
      	    return "Orange";
      }
      
	  @Override
	public String toString() {
		return "Name:Orange\n"+super.toString();
	}


	  @Override
	  public String taste() {
		return "Lime";
	  }
      
      
}
