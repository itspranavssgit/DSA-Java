package com.demo2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prog01 {

	public static void main(String[] args) {
		Map<Integer,String> m1= new HashMap<>();
		m1.put(143, "Ramesh");
		m1.put(121, "Anil");
		m1.put(132, "Mukesh");
		
		Set<Integer> keys=m1.keySet();
		System.out.println("Keys-->");
		for(Integer k:keys)
			System.out.println(k);
		
		System.out.println("Values-->");
		Collection<String> values=m1.values();
		for(String v: values)
			System.out.println(v);
		
		
	}
}
