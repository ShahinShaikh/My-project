package com.techcanvass.day1;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tablenum=2,output;
		int counter=1;
		int counter1=10;
		do
		{
			output=tablenum*counter;
			System.out.println(output);
			counter++;
		}while(counter<=10);
		do
		{
			output=tablenum*counter1;
			System.out.println(output);
			counter1--;
		}while(counter1>=1);
	}

}
