package com.techcanvass.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionlistEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> names = new ArrayList<String>();
		names.add("Shahin");
		names.add("Manisha");
		names.add("Amit");
		names.add("Sharad");
		System.out.println(names.size());
		System.out.println(names.get(1));
		names.remove(1);
		System.out.println(names.size());
		System.out.println(names.get(1));
		names.add("Rajnish");
		System.out.println(names.size());
		System.out.println(names.get(1));
		names.add("Rajnish");
		System.out.println(names.size());
		System.out.println(names.get(1));
		System.out.println(names);
		System.out.println("************************");
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}

}
