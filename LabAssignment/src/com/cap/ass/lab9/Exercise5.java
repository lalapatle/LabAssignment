package com.cap.ass.lab9;

import java.util.function.Function;

public class Exercise5 {
	public Integer findFactorial(Integer num)
	{
		if (num == 0) 
	        return 1; 
	    return num * findFactorial(num - 1); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> res=new Exercise5()::findFactorial;
		System.out.println("Factorial of 5 is : "+res.apply(5));
		
		
	}

}
