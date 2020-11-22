package com.cap.tr.ass.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer strt=new StringTokenizer(s);
		int sum=0;
		while(strt.hasMoreElements())
		{
			int n=Integer.parseInt(strt.nextToken());
			System.out.println(n);
			sum=sum+n;
		}
		System.out.println(sum);

	}

}
