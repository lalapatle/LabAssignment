package com.cap.tr.ass.lab3;

import java.util.Scanner;
import static java.lang.Math.*;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Integer a=sc.nextInt();
		String s=a.toString();
		StringBuffer sb=new StringBuffer("");
		
		for(int i=0;i<s.length()-1;i++)
		{
			char x=s.charAt(i);
			char y=s.charAt(i+1);
			
			int z=abs(Integer.parseInt(String.valueOf(x))-Integer.parseInt(String.valueOf(y)));
			sb.append(z);
			
		}
		sb.append(s.charAt(s.length()-1));
		int ans=Integer.parseInt(sb.toString());
		System.out.println(sb);
		
		
	}

}
