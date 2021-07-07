package com.assignment2.java;

public class ParameterConstructor {
	
	ParameterConstructor(int number){ // with parameter
		System.out.println("Constructor Without parameter "+number);
	}

	/*
	public ParameterConstructor() { //without parameter
		System.out.println("Constructor Without parameter");
	}
	*/

	public static void main(String[] args) {
	
		ParameterConstructor param1=new ParameterConstructor(); //instantiate object without parameter will give an error
		
		
	}

}
