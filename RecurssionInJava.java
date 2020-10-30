package com.TheMasterMindGroup.ObjectsAndClasses;
import java.util.Scanner;
public class RecurssionInJava {
	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = sum(n);
		
		System.out.print("The sum of the Series is: ");
		System.out.println(result);
		sc.close();
	}
		// To print the sum of first 10 numbers
		public static int sum(int k) {
			if (k>0) {
				return k + sum(k-1);
			}else {
				return 0; 
			}
		}
		
	
}
