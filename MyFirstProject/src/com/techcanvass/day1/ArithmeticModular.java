package com.techcanvass.day1;

public class ArithmeticModular {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
	
		num1=10;
		num2=5;

		System.out.println("Addition is "+addition(num1,num2));
		System.out.println("Subtraction is "+subtraction(num1,num2));
		System.out.println("Multiplication is "+multiplication(num1,num2));
		System.out.println("Division is "+division(num1,num2));
		System.out.println("Remainder is "+remainder(num1,num2));
		
	}

	public static int addition(int addnum1,int addnum2)
	{
		int sum = addnum1 + addnum2;
		return sum;
	}
	public static int subtraction(int subnum1,int subnum2)
	{
		int diff = subnum1 - subnum2;
		return diff;
	}
	public static int multiplication(int mulnum1,int mulnum2)
	{
		int mul = mulnum1 * mulnum2;
		return mul;
	}
	public static int division(int divnum1,int divnum2)
	{
		int div = divnum1 / divnum2;
		return div;
	}
	public static int remainder(int remnum1,int remnum2)
	{
		int rem = remnum1 % remnum2;
		return rem;
	}
}
