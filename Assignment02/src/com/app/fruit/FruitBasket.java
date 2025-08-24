package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {
	public static int opt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nMenu:");
        System.out.println("0. Exit");
        System.out.println("1. Add Mango");
        System.out.println("2. Add Orange");
        System.out.println("3. Add Apple");
        System.out.println("4. Show all fruit names");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        return choice;
		
	}
	
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int index = 0;

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Show all fruit names");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (index < size) {
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        basket[index++] = new Mango();
                        System.out.println("Mango added.");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2:
                    if (index < size) {
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        basket[index++] = new Orange();
                        System.out.println("Orange added.");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3:
                    if (index < size) {
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        basket[index++] = new Apple();
                        System.out.println("Apple added.");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4:
                    System.out.println("Fruits in basket:");
                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println(f.getName());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}