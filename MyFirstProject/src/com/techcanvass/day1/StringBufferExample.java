package com.techcanvass.day1;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer myBuffer = new StringBuffer();
		myBuffer.append("my");
		myBuffer.append(" name is shahin");
		System.out.println("append is "+myBuffer.toString());
		System.out.println("reverse is "+myBuffer.reverse());
		System.out.println("delete char at 2 is "+myBuffer.deleteCharAt(2));
		System.out.println("delete char with length is "+myBuffer.delete(2, 4));
	}

}
