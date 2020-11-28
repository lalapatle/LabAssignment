package com.cap.tr.ass.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> inputmap=new HashMap<>();
		inputmap.put(1, 90);
		inputmap.put(2, 80);
		inputmap.put(3, 85);
		inputmap.put(4, 70);
		inputmap.put(5, 7);
		
		Map<Integer,String> res=getStudents(inputmap);
		System.out.println("Student id : Medal earned");
		for(Map.Entry<Integer,String> e : res.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	
		

	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> inputmap) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> res=new HashMap<>();
		for(Map.Entry<Integer,Integer> e :inputmap.entrySet()) {
			int n=e.getValue();
			if(n>=90)
				res.put(e.getKey(), "Gold");
			else if(n>=80 && n<90)
				res.put(e.getKey(), "Silver");
			else if(n>=70 && n<80)
				res.put(e.getKey(), "Bronze");
			else 
				res.put(e.getKey(), "No medal");
			
				
			
		
		}
		return res;
	}

}
