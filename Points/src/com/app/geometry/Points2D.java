package com.app.geometry;

public class Points2D {
	double x;
	double y;
	
	public Points2D() {
		
	}
	public Points2D(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public String getDetails() {
		return "("+x+","+y+")";
	}
	public boolean isEqual( Points2D anotherPoint) {
		return this.x==anotherPoint.x && this.y==anotherPoint.y;
	}
	public double calculateDistance(Points2D anotherPoint) {
		double dx= this.x - anotherPoint.x;
		double dy= this.y - anotherPoint.y;
		return Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
	}
	

}