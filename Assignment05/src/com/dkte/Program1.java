package com.dkte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program1 {
	public static int menu(Scanner sc) {
		System.out.println("------>");
		System.out.println("0.Exit");
		System.out.println("1.Add the Students");
		System.out.println("2.Display All Student.");
		System.out.println("3.Search the Student by Roll no.");
		System.out.println("4.Sort the studenton roll no.");
		System.out.println("5.Sort the student on Name");
		System.out.println("6.Sort the student Marks.");
		System.out.println("Enter the Choice:");
		return sc.nextInt();	
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> students =new ArrayList<>();
	
		int Choice=0;
		class rollnoComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o1.rollno, o2.rollno);
				
			}
			
		}
		class nameComparator implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				return o1.Name.CompareTo(o2.Name);
			}
			
		}
		
		while((Choice=menu(sc))!=0) {
			
			switch (Choice) {
			case 1:
	             System.out.println("Enter The no of students:");
	             int n= sc.nextInt();
	             for(int i=0;i<n;i++) {
	            	 System.out.println("Enter the Name:");
	            	 String name=sc.next();
	            	 System.out.println("Enter The Roll:");
	            	 int roll=sc.nextInt();
	            	 System.out.println("Enter The Marks");
	            	 double marks=sc.nextDouble();
	            	 
	            	 Student stu= new Student(name,roll,marks);
	            	 students.add(stu);
	            	 System.out.println("Student Added successfully");
	            	 
	            	 }
				
				break;
			case 2:
				Iterator<Student> stu1= students.iterator();
				while (stu1.hasNext()) {
					System.out.println("Students - " + stu1.next());
				}
				break;
			case 3:	
				System.out.println("Enter the Roll no:");
				int roll=sc.nextInt();
				for(Student s:students)
				if(roll==s.getRollno()){
					System.out.println(s);
				}
				break;
			case 4:
				Collections.sort(students,new rollnoComparator());
				System.out.println("Sort by roll no:");
				for(Student s:students) {
					System.out.println(s);
				}
					
				break;
			case 5:
				Collections.sort(students,new nameComparator());
				System.out.println("Sort by Name:");
				for(Student s:students) {
					System.out.println(s);
				}
			default:
				break;
			}
			
		}

	}

}
