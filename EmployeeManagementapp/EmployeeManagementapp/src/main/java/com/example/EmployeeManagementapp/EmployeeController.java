package com.example.EmployeeManagementapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(){
		return employeerepository.findAll();
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmployee(@RequestParam String employeeid){
		return employeerepository.findByEmployeeid(employeeid);
	}
	
	@GetMapping("/addEmployee")
	@ResponseBody
	public String addEmployee() {
		
		String employeeid = "12211";
		String employeename = "Gowthaman M";
		String employeeemail = "gowthaman@iamneo.ai";
		String dept = "content-team";
		
		Employee cout = new Employee(employeeid,employeename,employeeemail,dept);
		employeerepository.save(cout);
		System.out.println("----------All Data saved into Database--------------");
		return "[{status:inserted}]";
	}
	
	@GetMapping("/deleteEmployee")
	public String deleteByEmployeeid(@RequestParam String employeeid) {
		System.out.println("employeeid"+employeeid);
		try {
       employeerepository.deleteByEmployeeid(employeeid);
		}catch(Exception ex) {
			System.out.println(ex);
		}
       return "[{status:deleted}]";
	}

}
