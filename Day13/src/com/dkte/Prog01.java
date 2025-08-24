package com.dkte;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prog01 {
public static void main(String[] args) {
	Set<String> s1= new HashSet<>();
	s1.add("Anil");
	s1.add("Mukesh");
	s1.add(null);
	s1.add(null);
	
	System.out.println("Size of s1-"+s1.size());
	
	for(String s: s1)
		System.out.println(s);
		
	}
	
	
	
}
