package com.cap.tr.ass.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		Map<Integer,Integer> res=getSquares(arr);
		System.out.println("Square list:");
		for(Map.Entry<Integer,Integer> e : res.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		
	}

	private static Map<Integer, Integer> getSquares(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> res=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			res.put(arr[i], arr[i]*arr[i]);
		}
		return res;
	}

}


