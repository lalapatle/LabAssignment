package com.cg.eis.exception;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int empSalary=sc.nextInt();
		try {
			if(empSalary<3000)
				throw new EmployeeException("Entered salary is below 3000");
			System.out.println("Entered salary is valid");
			
		} catch (EmployeeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
