package com.cap.tr.ass.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> data=new HashMap<>();
		data.put(01, 17);
		data.put(02, 18);
		data.put(03, 20);
		data.put(04, 85);
		data.put(05, 29);
		
		List<Integer> res=votersList(data);
		Iterator it=res.iterator();
		System.out.println("Eligible voters are: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

	private static List<Integer> votersList(Map<Integer, Integer> data) {
		// TODO Auto-generated method stub
		List<Integer> res=new ArrayList<>();
		for(Map.Entry<Integer,Integer> e : data.entrySet()) {
			if(e.getValue()>18)
				res.add(e.getKey());
			
		}
		return res;
	}

}
