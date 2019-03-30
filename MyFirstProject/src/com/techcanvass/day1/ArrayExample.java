package com.techcanvass.day1;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,5,7,10};
		//String names[]= {"shahin","aarzoo","","Preet"};
		String names[]=new String[4];
		names[0]="shahin";
		names[1]="aarzoo";
		names[2]="";
		names[3]="Preet";
		System.out.println(names[1]);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
