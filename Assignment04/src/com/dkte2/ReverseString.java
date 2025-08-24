package com.dkte2;

public class ReverseString {
     String s="2438";
     
   public void Logic() {
     
//     char[]arr=s.toCharArray();
//     for(int i=s.length()-1;i>=0;i--) {
//    	 System.out.println(arr[i]);
//     }
	   StringBuffer sb=new StringBuffer(s);
	   sb.reverse();
	   System.out.println(sb);
}
}