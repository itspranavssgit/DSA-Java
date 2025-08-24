package com.employee_management;

import java.util.Scanner;

public class TestApp {

    public static int menu(Scanner sc) {
        System.out.println("\n--- Employee Management Menu ---");
        System.out.println("1. Add Employee");
        System.out.println("2. Display All Employees");
        System.out.println("3. Search Employee by ID");
        System.out.println("4. Display Employees Joined in Given Year");
        System.out.println("5. Find Employee with Maximum Salary");
        System.out.println("6. Find Employee with Minimum Salary");
        System.out.println("7. Exit");
        System.out.print("Enter Your Choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opt = 0, counter = 0;
        Employee[] emp = new Employee[5];

        while ((opt = menu(sc)) != 7) {
            switch (opt) {
                case 1:
                    if (counter < emp.length) {
                        emp[counter] = new Employee();
                        emp[counter].setData(sc);
                        counter++;
                    } else {
                        System.out.println("Employee limit reached!");
                    }
                    break;

                case 2:
                    for (Employee e : emp) {
                        if (e != null) {
                            System.out.println(e.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the Employee ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Employee e : emp) {
                        if (e != null && e.getId() == searchId) {
                            System.out.println("Employee ID Found!");
                            System.out.println(e.toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee not found!");
                    break;

                case 4:
                    System.out.print("Enter year of joining: ");
                    int yr = sc.nextInt();
                    for (Employee e : emp) {
                        if (e != null && e.getDoj().getYear() == yr) {
                            System.out.println(e.toString());
                        }
                    }
                    break;

                case 5:
                    Employee maxEmp = null;
                    for (Employee e : emp) {
                        if (e != null) {
                            if (maxEmp == null || e.getSalary() > maxEmp.getSalary()) {
                                maxEmp = e;
                            }
                        }
                    }
                    if (maxEmp != null)
                        System.out.println("Employee with Max Salary: " + maxEmp.toString());
                    break;

                case 6:
                    Employee minEmp = null;
                    for (Employee e : emp) {
                        if (e != null) {
                            if (minEmp == null || e.getSalary() < minEmp.getSalary()) {
                                minEmp = e;
                            }
                        }
                    }
                    if (minEmp != null)
                        System.out.println("Employee with Min Salary: " + minEmp.toString());
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }

        System.out.println("Exited Successfully.");
    }
}
