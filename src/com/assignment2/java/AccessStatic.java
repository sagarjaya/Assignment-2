package com.assignment2.java;

public class AccessStatic {
	static int a=6;    //initializing static variable
	int b=6; 			//initializing non-static variable
	
	public void display() { //non static method
		a++;
		b++;
		System.out.println("Value of A: "+a+" and B: "+b+" ");
	}

	public static void main(String[] args) {
		
		AccessStatic a1=new AccessStatic();
		a1.display();
		AccessStatic a2=new AccessStatic();
		a2.display();

	}

}
