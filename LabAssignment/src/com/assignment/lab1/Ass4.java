package com.assignment.lab1;

import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int counter=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					counter++;
					
				}
			}
			if(counter==2)
			{
				System.out.println(i+" ");
			}
		}

	}

}
