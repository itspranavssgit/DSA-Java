package com.dkte;

import java.util.ArrayList;
import java.util.List;

public class Prog1 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Anil");
		l1.add("Mukesh");
		l1.add(1, "Ramesh");
		l1.set(2, "Suresh");

		for (String e : l1)
			System.out.println(e);

	}

}

