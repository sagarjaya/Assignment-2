package com.assignment2.java;

 class Data {
	protected int num=10;
		}

public class ProtectedModifier extends Data{
	
	protected void change() {
		num=20;
		System.out.println(num);
		}
	public static void main(String args[]) {
	ProtectedModifier pro=new ProtectedModifier();
	pro.change();
}	
}