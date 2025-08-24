package com.demo2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Prog03 {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(143, "Ramesh"); // Entry<K,V> -> Entry<Integer,String>
		m1.put(121, "Anil");
		m1.put(132, "Mukesh");
		m1.put(154, "Suresh");
		m1.put(166, "Ram");

		Set<Map.Entry<Integer, String>> entries = m1.entrySet();
		for (Map.Entry<Integer, String> ele : entries)
			System.out.println(ele.getKey() + "-" + ele.getValue());

	}

}
