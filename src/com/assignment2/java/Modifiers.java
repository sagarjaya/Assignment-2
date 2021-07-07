package com.assignment2.java;

class Mem {
	
	public int num1; // it can be accessed anywhere
	
	private int num2; //it can be used only within the class
	
	protected int num3; //it can be accessed through inherithance by extending
	
	int num4; // default will accesses within the same package
	
	public void num1() {
		num1=1;
		System.out.println(num1);
	}
	public void num2() {
		num2=2;
		System.out.println(num2);
	}
	private void num3() {
		num3=2;
		System.out.println(num3);
	}
	void num4() {
		num4=4;
		System.out.println(num4);
	}
	
}
public class Modifiers extends Mem{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mem mod=new Mem();
		System.out.println(mod.num1);
		System.out.println(mod.num2);
		System.out.println(mod.num3);
		System.out.println(mod.num4);
		mod.num1();
		mod.num2();
		mod.num3(); // it is private modifier as it can be used only within that class
		mod.num4();
	}

}
