package com.app.fruit;

public class Mango extends Fruit {
	
	public Mango()
    {
  	      super();
  	      System.out.println("Mango");
  	      
    }
	
      public Mango(String nm,String color, double weight, String name, boolean isFresh)
      {
    	      super(nm,color, weight,name,isFresh);
    	      System.out.println("Mango");
    	      
      }

      public String getFruitName()
      {
      	    return "Mango";
      }
      
	  @Override
    	public String toString() {
		return "\nName:Mango"+super.toString();
	}

		@Override
		public String taste() {
			return "SweetnLime";
		}

     
}
