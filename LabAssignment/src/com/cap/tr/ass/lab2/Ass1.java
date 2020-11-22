package com.cap.tr.ass.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int ssm=getSecondSmallest(arr);
		System.out.println(ssm);
		
	}

	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int ssm=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				ssm=arr[i+1];
				break;
			}
		}
		System.out.println(ssm);
		
		return ssm;
	}

}
