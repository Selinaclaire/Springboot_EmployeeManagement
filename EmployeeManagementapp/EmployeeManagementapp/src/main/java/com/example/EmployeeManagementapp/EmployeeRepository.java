package com.example.EmployeeManagementapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByEmployeeid(@Param("employeeid") String employeeid);
	
	@Transactional
    void deleteByEmployeeid(@Param("employeeid") String employeeid);

}
