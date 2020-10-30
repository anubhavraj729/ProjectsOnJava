package com.TheMasterMindGroup.ObjectsAndClasses;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double count = sc.nextInt();
		double n1=0,n2=1,n3=0,i;
		double sum=1;
		System.out.print(n1+" "+n2);
		sc.close();
		
		for(i=2;i<count;++i) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			sum = sum+n2;
		}
		
		System.out.print("\nThe Sum Of The Fibonacci Series is: "+sum);
		
	}
	
}
