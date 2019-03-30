package com.techcanvass.day1;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream os= new FileOutputStream("D://shahin//sample.txt");
		String mystr="I live in India";
		byte b[]=mystr.getBytes();
		os.write(b);
		os.close();
	}

}
