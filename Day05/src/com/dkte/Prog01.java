package com.dkte;

import java.util.Scanner;

public class Prog01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.displayEmployee();

		Employee e2 = new Employee();
		e2.acceptEmployee(sc);
		e2.addVehicle(sc);
		e2.displayEmployee();

	}

}