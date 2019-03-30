package com.techcanvass.day1;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			/*int num1=5,num2=0;
			System.out.println(num1/num2);
			int num1[]= {1,2,3,4};
			System.out.println(num1[4]);*/
			
			String name=null;
			//System.out.println(name.length());
			ArrayIndexOutOfBoundsException a= new ArrayIndexOutOfBoundsException();
			throw a;
			
			
		} catch (ArithmeticException e) {
		
			e.printStackTrace();
			e.getMessage();
			System.out.println("Number divided by zero");
		}
		
		/*catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("Array out of bound");
		}*/
		
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null pointer exception");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Generic exception message");
		}
		finally {
			System.out.println("Hi");
		}
	}

}
