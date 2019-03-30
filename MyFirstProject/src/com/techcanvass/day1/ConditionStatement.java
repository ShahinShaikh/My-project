package com.techcanvass.day1;

import java.util.Scanner;

public class ConditionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int percentage=35;
		if(percentage>=35&percentage<=60)
		{
			System.out.println("Second class");
		}
		else if(percentage>=60 & percentage<=75)
		{
			System.out.println("First Class");
		}
		else if(percentage>=75&percentage<=100)
		{
			System.out.println("Distintion");
		}
		else
		{
			System.out.println("Fail");
		}
	}

	

}
