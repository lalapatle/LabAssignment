package com.cap.ass.lab9;

import java.util.Scanner;
import java.util.function.Function;

public class Excersice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Function<String, String> fun = (str) -> {
//		string class method
			// public String replaceAll(String regex,
//                    String replacement)
//			regex - the regular expression to which this string is to be matched
//			replacement - the string to be substituted for each match
			return str.replaceAll(".(?=.)", "$0 ");

		};

		System.out.println("Input the string: ");
		String str = sc.next();
		System.out.println("Space seprated result is of " + str + " " + fun.apply(str));

	}

}
