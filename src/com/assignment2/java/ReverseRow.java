package com.assignment2.java;

public class ReverseRow {

	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3},
				{4,5,6,}};
		
		System.out.println("Arrary elements");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j] +" ");//to display the matrix in two dimensional array
			}
			System.out.println();
		}
		System.out.println("Arrary elements in reverse order");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length;j>=0;j--) {
				System.out.print(arr[i][j] +" ");//to display the matrix in reverse order
			}
			System.out.println();
		}

	}

}
