package com.assignment.lab1;

import java.util.Scanner;

public class Ass3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1;
		int b=1;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			int s=a+b;
			a=b;
			b=s;
		}
	}

}
