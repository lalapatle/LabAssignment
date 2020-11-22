package com.cap.tr.ass.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		String string[]=new String[n];
		for(int i=0;i<n;i++)
		{
			string[i]=sc.next();
		}
		String resarr[]=sortString(string);
		for (String string2 : resarr) {
			System.out.println(string2);
		}

	}

	private static String[] sortString(String[] string) {
		// TODO Auto-generated method stub
		Arrays.sort(string);
		for(int i=0;i<string.length;i++)
		{
			if(i<(string.length/2)+1)
				string[i]=string[i].toUpperCase();
			else
				string[i]=string[i].toLowerCase();
		}
		return string;
	}

}
