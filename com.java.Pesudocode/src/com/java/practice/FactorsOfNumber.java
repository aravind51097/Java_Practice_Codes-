package com.java.practice;

import java.util.Scanner;

class Factor{
	
	void factorOfNumber(int num) {
		
		System.out.println("The Factors of the Number are : ");
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
	}
}


public class FactorsOfNumber {
	public static void main(String[] args) {
		
		Factor obj=new Factor();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Number  :");
		int num=input.nextInt();
		obj.factorOfNumber(num);
	}

}
