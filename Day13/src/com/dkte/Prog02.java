package com.dkte;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prog02 {

	public static void main(String[] args) {
//		Set<String> s1=new HashSet<>();
//		Set<String> s1=new LinkedHashSet<>();
		Set<String> s1=new TreeSet<>();
		s1.add("Suresh");
		s1.add("Mukesh");
		s1.add("Anil");
		s1.add("Ramesh");
		s1.add("Ram");
		
		System.out.println("Size of s1-"+s1.size());
		
		for(String s: s1)
			System.out.println(s);
		
	}
}
