package com.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Prog02 {

	public static void main(String[] args) {
//		Map<Integer,String> m1= new HashMap<>();
		Map<Integer,String> m1= new LinkedHashMap<>();
		m1.put(143, "Ramesh");
		m1.put(121, "Anil");
		m1.put(132, "Mukesh");
		m1.put(154, "Suresh");
		m1.put(166, "Ram");
		m1.put(null, "Sham"); 
		m1.put(null, "Ram"); 
		m1.put(178, null);
		m1.put(189, null);
		System.out.println("size of m1 - " + m1.size());

		Set<Integer> keys = m1.keySet();
		System.out.println("Keys ->");
		for (Integer k : keys)
			System.out.println(k);

		System.out.println("Values ->");
		Collection<String> values = m1.values();
		for (String v : values)
			System.out.println(v);

	}

}
