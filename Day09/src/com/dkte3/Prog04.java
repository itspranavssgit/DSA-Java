package com.dkte3;

import java.util.StringTokenizer;

public class Prog04 {

	public static void main(String[] args) {
		String s = "www.sunbeaminfo.com/placements";
		System.out.println("OG string - " + s);
		System.out.println("Tokens ->");

		StringTokenizer st = new StringTokenizer(s, "./", true);
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());

	}


}
