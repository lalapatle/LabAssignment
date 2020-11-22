package com.cap.tr.ass.lab3;

import java.util.Scanner;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean res=checkPositiveString(str);
		if(res)
			System.out.println("it is positive");
		else {
			System.out.println("it is negative");
		}

	}

	private static boolean checkPositiveString(String str) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]>(ch[i+1]))
				return false;
		}
		return true;
	}

}
