package com.nt.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private Integer id;
	private String Name;
	private String designation;
	private String address;


}
