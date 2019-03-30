package com.techcanvass.day1;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="shahin",lname="Shahin ",fullname=fname+lname;
		String name="I live in india";
		System.out.println("fname equals lname is "+fname.equals(lname));
		System.out.println("fname equals lname is "+fname.equalsIgnoreCase(lname));
		System.out.println("fname starts with "+ "'shah is'"+fname.startsWith("shah"));
		System.out.println("fname ends with "+ "'in is'"+fname.endsWith("in"));
		System.out.println("fname upper "+ fname.toUpperCase());
		System.out.println("lname lower "+ lname.toLowerCase());
		System.out.println("lname substring"+ lname.substring(2));
		System.out.println("lname substring length"+ lname.substring(2,3));
		System.out.println("Trim is "+ lname.trim());
		System.out.println("fname equals lname is "+fname.replace("a", "b"));
		System.out.println("split "+name.split(" ")[2]);
	}

}
