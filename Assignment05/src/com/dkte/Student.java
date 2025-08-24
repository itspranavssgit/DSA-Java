package com.dkte;

public class Student implements Comparable<Student> {

	int rollno;
	String Name;
	double Marks;
	public Student() {
		
	}
	public Student(int rollno) {
		this.rollno = rollno;
	}
	public Student(String name) {
		Name = name;
	}
	public Student(Double marks) {
		Marks = marks;
	}
	public Student( String name,int rollno, Double marks) {
		this.rollno = rollno;
		this.Name = name;
		this.Marks = marks;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return Name;
	}
	public double getMarks() {
		return Marks;
	}
	@Override
	public String toString() {
		return "Student [\nrollno=" + rollno + "\nName=" + Name + "\nMarks=" + Marks + "]";
	}
	@Override
	public int compareTo(Student obj) {
		
		return this.rollno-obj.rollno;
	}
    
	

	
	
}
