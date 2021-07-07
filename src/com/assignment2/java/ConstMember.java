package com.assignment2.java;

public class ConstMember {
	
	final int age=18; // once it is constant we can't change the value of the variable	
	void display() {
		age=20; // now if we assign any value to the variable will get an error
		System.out.println(age);
	}
	public static void main(String[] args) {
		ConstMember cons=new ConstMember();
		cons.display();
	}

}
