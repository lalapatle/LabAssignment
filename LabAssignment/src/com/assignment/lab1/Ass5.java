package com.assignment.lab1;

import java.util.Scanner;

public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum= calculateSum(n);
		System.out.println(sum);
		sc.close();
	}

	private static int calculateSum(int n) {
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		
		return sum;
		// TODO Auto-generated method stub
		
	}

}
