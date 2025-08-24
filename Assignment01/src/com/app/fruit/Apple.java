package com.app.fruit;

public class Apple extends Fruit {
    
	public Apple()
    {
  	      super();
  	      System.out.println("Apple");      	
    }
  
	
	
	public Apple(String nm,String color, double weight, String name, boolean isFresh) {
		super(nm,color, weight,name,isFresh);
	}

	  @Override
	public String toString() {
		return "Name:Apple\n"+super.toString();
	}

    public String getFruitName()
    {
    	    return "Apple";
    }

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}
	  
	   
	   
      
      



	 



	  
}
