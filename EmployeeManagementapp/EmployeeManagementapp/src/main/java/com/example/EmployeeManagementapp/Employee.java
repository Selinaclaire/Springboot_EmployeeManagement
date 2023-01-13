package com.example.EmployeeManagementapp;

import jakarta.persistence.Entity;

@Entity
public class Employee {
	
	@jakarta.persistence.Id
	private String employeeid;
	private String employeename;
	private String employeeemail;
	private String dept;
	
	public Employee() {}
	
	public Employee(String employeeid, String employeename, String employeeemail, String dept) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeeemail = employeeemail;
		this.dept = dept;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeemail() {
		return employeeemail;
	}
	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
