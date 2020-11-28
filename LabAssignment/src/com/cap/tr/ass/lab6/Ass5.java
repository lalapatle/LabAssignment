package com.cap.tr.ass.lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,6,8,9,7};
		int res=getSecondSmallest(arr);
		System.out.println("Second smallest number is: "+res);
	}

	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		//arrays.stream--
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());;
		Collections.sort(list);
		int res=(int)list.get(1);
		return res;
	}

}
