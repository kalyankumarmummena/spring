package com.dbs.employeemngt.repository;
import com.dbs.employeemngt.dto.Employee;

import java.util.List;//for core java list
import java.util.Optional;//for optional

import org.springframework.stereotype.Repository;//for repository


@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeeById(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
