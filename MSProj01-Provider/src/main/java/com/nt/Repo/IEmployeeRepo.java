package com.nt.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.modal.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
