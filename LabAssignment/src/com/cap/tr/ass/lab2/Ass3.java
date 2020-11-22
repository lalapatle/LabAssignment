package com.cap.tr.ass.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int[] res=getSorted(arr);
		for (int i : res) {
			System.out.println(i);
		}

	}

	private static int[] getSorted(int[] arr) {
		// TODO Auto-generated method stub
		String ass=Arrays.toString(arr);
		StringBuilder sb=new StringBuilder();
		sb.append(ass);
		sb=sb.reverse();
		
		Arrays.sort(arr);
		
		
		
		
		return arr;
	}

}
