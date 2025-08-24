package com.dkte;

public class DuplicateArrays {
   String arr[];
   String arr2[];
   
   public void Display() {
	   String arr[]= {"Apple","Mango","Grapes"};
	    String arr2[]= {"Apple","Mango",};
	    System.out.println("Duplicates:");
	    if(arr.length == arr2.length) {
	    	System.out.println("Arrays Have Same Length.");
	    }else {
	    	System.out.println("Arrays has no Same Length.");
	    }
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr2.length;j++) {
	    		if(arr[i].equals(arr2[j])){
	            System.out.println(arr[i]);	}	
	    	}
	    }
	 
	}
}
