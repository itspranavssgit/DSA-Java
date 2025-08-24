package com.app.fruit;

public class Fruit {
    String Color;
    double Weight;
    String Name;
    boolean isFresh=true;
    
    public Fruit() {
    	
    }
    
	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.Color = color;
		this.Weight = weight;
		this.Name = name;
		this.isFresh = isFresh;
	}
	

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		this.Weight = weight;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [Color=" + Color + ", Weight=" + Weight + ", Name=" + Name + ", isFresh=" + isFresh + "]";
	}
	
    public String taste() {
    	return "no specific taste";
    }
}

