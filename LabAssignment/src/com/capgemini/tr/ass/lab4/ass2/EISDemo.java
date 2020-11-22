package com.capgemini.tr.ass.lab4.ass2;

public class EISDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		EmployeeService emp = new EmployeeServiceImpl(); 
		emp.getEmployeeDetails(e1);
		System.out.println("Insurance Scheme : "+emp.findInsuranceScheme(e1));
		emp.showEmployeeDetails(e1);
	}

}
