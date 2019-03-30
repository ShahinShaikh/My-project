package com.techcanvass.day1;

public class Arithmetic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		
		num1=10;
		num2=5;

		ArithmeticOperation myoperator = new ArithmeticOperation();
		
		System.out.println("Addition is "+myoperator.addition(num1,num2));
		System.out.println("Subtraction is "+myoperator.subtraction(num1,num2));
		System.out.println("Multiplication is "+myoperator.multiplication(num1,num2));
		System.out.println("Division is "+myoperator.division(num1,num2));
		System.out.println("Remainder is "+myoperator.remainder(num1,num2));
	}

}
