package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	

	public String storeEmployeeDetails(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Salary must be > 12000";
		}else if(employeeDao.storeEmployeeDetails(emp)>0) {
			return "REcord stored";
		}else {
			return "Record didn't store";
		}
	}
}
