package com.assignment.lab1;

import java.util.Scanner;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=checkNumber(n);
		if(b)
		{
			System.out.println("yes it is");
		}
		else
		{
			System.out.println("it is not");
		}
		

	}

	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		if(n%2==1)
			return false;
		while(n/2!=0)
		{
			n=n/2;
			if(n%3==0)
				return false;
		}
		
		return true;
	}

}
