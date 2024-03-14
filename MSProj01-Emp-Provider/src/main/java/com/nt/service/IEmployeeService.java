package com.nt.service;

import java.util.List;

import com.nt.entity.Employee;

public interface IEmployeeService {
public String saveEmployee(Employee emp);
public List<Employee> getallEmployess();
}
