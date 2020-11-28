package com.cap.tr.ass.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[] arr=sc.next().toCharArray();
		Map<Character,Integer> res=countChars(arr);
		for(Map.Entry<Character,Integer> e : res.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		
		
		
	}

	private static Map<Character, Integer> countChars(char[] arr) {
		// TODO Auto-generated method stub
		Map<Character,Integer> res=new HashMap<>();
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(res.containsKey(arr[i]))
			{
				res.replace(arr[i],res.get(arr[i])+1);
			}
			else {
				res.put(arr[i],1);
			}
		}
		return res;
	}

}
