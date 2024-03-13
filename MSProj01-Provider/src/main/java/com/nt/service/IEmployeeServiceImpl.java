package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repo.IEmployeeRepo;
import com.nt.modal.Employee;
@Service
public class IEmployeeServiceImpl implements IEmployee {
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public String saveEmployee(Employee emp) {
		Integer msg=repo.save(emp).getId();
		return "Employee saved with id"+msg;
	}

}
