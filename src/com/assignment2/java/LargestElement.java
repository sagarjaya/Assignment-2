package com.assignment2.java;

public class LargestElement {

	public static void main(String[] args) {
		int number[][]= {
				{2,4,8,7},
				{1,3,5,9},
				{2,5,7,10}};
		int max=number[0][0];
		System.out.println("Array elements of an array");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("largest elements of individual rows are :");
		for(int i=0;i<number.length;i++) {
			
			for(int j=0;j<number[i].length;j++) {
				if(number[i][j]>max)
				{
					max=number[i][j];
				}
			}
			System.out.println("largest elements of individual " +(i+1)+" row: "+max);
		}
		
}
}
		


