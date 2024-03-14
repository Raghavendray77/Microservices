package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repo.IEmployeeRepo;
import com.nt.entity.Employee;
@Service
public class IEmployeeServiceImpl implements IEmployeeService {
	@Autowired
private IEmployeeRepo repo;
	@Override
	public String saveEmployee(Employee emp) {
    
		return "Employee saved   : "+repo.save(emp).getId();
	}

}
