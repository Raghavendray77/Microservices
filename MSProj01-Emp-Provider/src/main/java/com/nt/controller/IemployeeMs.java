package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeServiceImpl;

@RestController
@RequestMapping("/Register")
public class IemployeeMs {
	@Autowired
	private IEmployeeServiceImpl Service;
	@GetMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee Emp){
		try {
		String msg=Service.saveEmployee(Emp);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		}
		catch (Exception e) {
			return new ResponseEntity<String>("Internal probleam",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
