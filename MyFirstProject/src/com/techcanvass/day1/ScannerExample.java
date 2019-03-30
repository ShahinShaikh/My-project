package com.techcanvass.day1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter text");
		String word = myscan.nextLine();
		System.out.println("user input is "+word);
		myscan.close();
	}

}
