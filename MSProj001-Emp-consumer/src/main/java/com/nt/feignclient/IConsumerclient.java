package com.nt.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.entity.Employee;

@FeignClient("provider-service")
public interface IConsumerclient {
	@PostMapping("/Register/save")
	public String fetchdetails(@RequestBody Employee Emp);

}
