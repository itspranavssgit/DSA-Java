package com.dkte3;

import java.util.StringTokenizer;

public class Prog02 {

	public static void main(String[] args) {
		String s="dkte college";
		System.out.println("OG String-"+s);
		System.out.println("Tokens--->");
		
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens());
	}

}
