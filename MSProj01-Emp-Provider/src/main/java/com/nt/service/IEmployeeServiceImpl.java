package com.nt.service;

import java.util.List;

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
	@Override
	public List<Employee> getallEmployess() {
		
		return repo.findAll();
	}
	

}
