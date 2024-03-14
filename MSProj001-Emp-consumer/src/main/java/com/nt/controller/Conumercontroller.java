package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.feignclient.IConsumerclient;

@RestController
@RequestMapping("/Register")
public class Conumercontroller {
	@Autowired
	private IConsumerclient provider;
	@PostMapping("/add")
	public ResponseEntity<String> Adddetails(@RequestBody Employee emp){
		try {
			String msg=provider.fetchdetails(emp);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} catch ( Exception e) {
			return new ResponseEntity<String>("InternalError", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
