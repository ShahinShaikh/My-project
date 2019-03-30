package com.techcanvass.day1;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tablenum=2,output;
		int counter=1;
		int counter1=10;
		while(counter<=10)
		{
			output=tablenum*counter;
			System.out.println(output);
			counter++;
		}
		while(counter1>=1)
		{
			output=tablenum*counter1;
			System.out.println(output);
			counter1--;
		}
	}

}
