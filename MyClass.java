package com.TheMasterMindGroup.ObjectsAndClasses;

public class MyClass {
	
	int x = 55;
	int y = 3;
	public char z = 'A';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myObj = new MyClass();
		OtherClass myObj1 = new OtherClass();
		// This inherits the characteristics of the parent class 
		// This is known as Objects
		// Topic is "ObjectOrientedProgrammingLanguage OOPs Concept"
		System.out.println("This is Attribute No 1: "+myObj.x);
		System.out.println("This is Attribute No 2: "+myObj.y);
		System.out.println("This is Attribute No 3: "+myObj.z);
		System.out.println("This is Attribute No 4: "+myObj1.z);
	}

}
