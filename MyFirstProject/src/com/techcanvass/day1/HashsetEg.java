package com.techcanvass.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashsetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet <String> names = new HashSet<String>();
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("Shahin");
		names.add("Manisha");
		names.add("Amit");
		names.add("Sharad");
		names.add("Sharad");
		System.out.println(names);
		System.out.println(names.size());
		names.remove("Manisha");
		System.out.println(names);
		System.out.println(names.size());
		
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}

}
