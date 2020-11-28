package com.cap.tr.ass.lab6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hash=new HashMap<>();
		hash.put(1,"Krishna");
		hash.put(2, "Dev");
		List sortedValue=getValues(hash);
		
		Iterator it=sortedValue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

	

	private static List getValues(HashMap<Integer, String> hash) {
		// TODO Auto-generated method stub
		List res=new ArrayList();
		res.addAll(hash.values());
		Collections.sort(res);
		
		
		return res;
	}

}
