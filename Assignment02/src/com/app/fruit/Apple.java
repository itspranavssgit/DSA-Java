package com.app.fruit;

public class Apple extends Fruit {

	public Apple() {
		
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		
	}

	@Override
	public String taste() {
		return "Sweet n Sour";	
		}
	
	
}
