package com.tester;

import java.util.Scanner;

import com.app.geometry.Points2D;

class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X and Y for point 1:");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Enter the X and Y for Point 2:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		Points2D p1 = new Points2D(x1,y1);
		Points2D p2 = new Points2D(x2,y2);
		
		System.out.println("Point1:"+ p1.getDetails());
		System.out.println("Points2"+ p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("Both points are At same location");
		}else {
			System.out.println("Points are different.");
			System.out.println("Distance between two points "+p1.calculateDistance(p2));
			
		}

	}

}