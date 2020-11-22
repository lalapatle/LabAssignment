package com.assignment.lab1;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class Ass7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  number=sc.nextInt();
			// TODO Auto-generated method stub
		boolean r=checkNumber(number);
		if(r==true)
		{
			System.out.println("increasing");
		}
		else
			System.out.println("not increasing");
			
	}

	private static boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		int pre=number%10;
		
		 number=number/10;
		while(number!=0) {
			int x=number%10;
			number/=10;
			if(pre<x)
				return false;
			pre=x;
			
		
		
		}
		
		
		return true;
	}

	
}
