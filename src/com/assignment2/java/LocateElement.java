package com.assignment2.java;

public class LocateElement {

	public static void main(String[] args) {
		

		int number[]= {2,4,6,8,4,4};
		int location=4; // to find an element 
		int count=0;
		
		System.out.println("Array elements of an array");//original array elements
		for(int k=0;k<number.length;k++) {
			System.out.print(number[k]+" ");
		}
		
		System.out.println(" ");
		for(int i=0;i<number.length;i++) {//to find an element in an array
			if(number[i]==location) {
				count++;
				System.out.println("Element " +number[i]+" is found at "+(i+1)+" location in an array");
		}
			
	}
		System.out.println(count+" times it has occured");
	}

}
