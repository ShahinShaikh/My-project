package com.techcanvass.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi= new FileInputStream("D://shahin//sample.txt");
		int i=0;
		while((i=fi.read())!=-1)
		{
			System.out.print((char) i);
		}
	}

}
