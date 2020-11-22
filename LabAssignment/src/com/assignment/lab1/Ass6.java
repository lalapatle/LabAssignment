package com.assignment.lab1;

import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=calculateDifference(n);
		System.out.println("Diff"+sum);
	}

	private static int calculateDifference(int n) {
		// TODO Auto-generated method stub
		int s1=0,s2=0;
		for(int i=1;i<n;i++)
		{
			s1=s1+(i^2);
			
		}
		
		for(int i=1;i<n;i++)
		{
			s2=s2+i;
			
		}
		s2=s2^2;
		int diff =s1-s2;
		
		return diff;
	}

}
