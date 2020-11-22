package com.training.ass.lab1;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0;
		while(n!=0)
		{
			int rem=n%10;
			n/=10;
			sum=sum+(rem*rem*rem);
			
		}
		System.out.println("sum of cubes of digits of a number"+ sum);

	}

}
