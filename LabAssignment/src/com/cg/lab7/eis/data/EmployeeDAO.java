package com.cg.lab7.eis.data;

import java.util.List;

import com.cg.eis.lab7.service.InsuranceScheme;
import com.cg.lab7.eis.bean.Employee;

public interface EmployeeDAO {
	public Integer addEmployee(Employee employee) throws Exception;
	public Integer deleteEmployee(Integer empid) throws Exception;
	public List<Employee> 
	getEmployeesByInsuranceScheme(InsuranceScheme insuranceScheme) 
			throws Exception;
	
	public List<Employee> getAllEmployees() throws Exception;
}
