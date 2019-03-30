package com.techcanvass.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Map<Integer, String> m = new HashMap<Integer, String>();
		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(467, "Rajnish");
		m.put(567, "Manisha");
		m.put(302, "Shahin");
		m.put(102, "Amit");
		
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get(302));
		
		m.remove(302);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get(1));
		System.out.println(m.get(102));
		
		Set<Integer> keys = m.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println(key);
			System.out.println(m.get(key));
			
		}
		
	}

}
