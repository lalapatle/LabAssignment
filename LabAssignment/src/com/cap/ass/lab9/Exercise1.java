package com.cap.ass.lab9;

import java.util.function.BiFunction;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Double> bfunc=(x,y)->Math.pow(x,y);
		System.out.println(bfunc.apply(10, 2));
	}

}
