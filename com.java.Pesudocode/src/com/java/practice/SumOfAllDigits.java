package com.java.practice;

import java.util.Scanner;

class Sum{
	
	void sumOfGivenDigits(int num) {
		int num1=num;
		if(num<10) {
			System.out.println("The Sum of the number "+ num + " is : "+num);
		}
		else {
			int temp=0;
			String len_of_num=Integer.toString(num);
			for(int i = 0 ;i<len_of_num.length();i++) {
				int digit=num%10;
				num=num/10;
				temp=temp+digit;
				
			}System.out.println("The Sum of the number "+ num1 + " is : "+temp);
			
		}
		
	}
}

public class SumOfAllDigits {
	public static void main(String[] args) {
		
		Sum obj=new Sum();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the digit :");
		int num=input.nextInt();
		obj.sumOfGivenDigits(num);
		
	}

}
