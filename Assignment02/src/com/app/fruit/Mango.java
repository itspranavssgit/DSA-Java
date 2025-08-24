package com.app.fruit;

public class Mango extends Fruit {

	 public Mango() {
		 
	 }

	 public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		
	 }

	 @Override
	 public String taste() {
		return "Sweet";
	 }
	 
	 
}
