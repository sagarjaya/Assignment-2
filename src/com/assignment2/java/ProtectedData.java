package com.assignment2.java;


protected class Derived { // protected modifier can't be used with the class
	String Method() {
		return "wow";
	}
}
class ProtectedData{
	public void useId() {
		Derived z=new Derived();
		System.out.print("base says, " +z.Method());
	}


	}

