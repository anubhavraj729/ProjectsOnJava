package com.TheMasterMindGroup.ObjectsAndClasses;

// We can use the previous variable in this program as well
// This is the power of ObjectOrientation 

public class OtherClass {
	public int z = 7;
	public static void main(String [] args) {
		MyClass myObj = new MyClass();
		OtherClass myObj1 = new OtherClass();
		System.out.println(myObj.x);
		System.out.println(myObj1.z);
		System.out.append(myObj.z);
		// Remember append is always used for two chars
		System.out.print("\n"+myObj.y);
	}
}
