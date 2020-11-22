package com.cap.tr.ass.lab3;

import java.util.Scanner;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res=getImage(str);
		System.out.println(str+"|"+res);

	}

	private static String getImage(String str) {
		// TODO Auto-generated method stub
		StringBuffer sf=new StringBuffer(str);
		
		return sf.reverse().toString();
	}

}
