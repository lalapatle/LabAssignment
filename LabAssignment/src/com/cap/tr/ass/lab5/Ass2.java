package com.cap.tr.ass.lab5;

import java.util.Scanner;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String fname=sc.nextLine();
		String lname=sc.nextLine();
		try {
			if(fname.length()==0 && lname.length()==0)
				throw new Exception();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("first name and last name is blank");
			
		}
		
		

	}

}
