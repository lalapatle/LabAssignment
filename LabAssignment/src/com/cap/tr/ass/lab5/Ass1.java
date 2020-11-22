package com.cap.tr.ass.lab5;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person age: ");
		int age=sc.nextInt();
		try {
			if(age<=15)
				throw new Exception();
			System.out.println("Entered age is valid.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entered age is Invalid");
		}

	}

}
