package com.dbs.employeemngt.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.context.ApplicationContext;

import com.dbs.employeemngt.dto.Employee;
import com.dbs.employeemngt.service.EmployeeService;

public interface EmployeeRepository {
	public Employee createEmployee(Employee employee);
	public Employee deleteEmployee(String empId);
	public Employee updateEmployee(String empId,Employee employee);
	public Optional<Employee> getEmployeeeById(String empId);
	public Optional<List<Employee>> getEmployees();

	
}
