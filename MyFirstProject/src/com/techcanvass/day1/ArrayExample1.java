package com.techcanvass.day1;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16,17}};
		System.out.println(numbers[0][0]);
		System.out.println(numbers[0][1]);
		System.out.println(numbers[0][2]);
		System.out.println(numbers[0][3]);
		System.out.println(numbers[1][0]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[1][2]);
		System.out.println(numbers[1][3]);
		System.out.println(numbers[2][0]);
		System.out.println(numbers[2][1]);
		System.out.println(numbers[2][2]);
		System.out.println(numbers[2][3]);
		System.out.println(numbers[3][0]);
		System.out.println(numbers[3][1]);
		System.out.println(numbers[3][2]);
		System.out.println(numbers[3][3]);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println();
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+"\t");
				
			}
		}
	}

}
