package com.nt.entity;

import java.io.Serializable;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer Id;
	@Column(name = "NAME")
	@NonNull
	private String name;
	@Column(name = "Designation")
	@NonNull
	private String Designation;
	@Column(name = "SALARY")
	@NonNull
	private Integer salary;
	@Column(name = "ADDRESS")
	@NonNull
	private String Address;
	
		

}
