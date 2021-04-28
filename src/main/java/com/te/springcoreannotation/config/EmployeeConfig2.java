package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotation.bean.Employee;

@Configuration
public class EmployeeConfig2 {
  
	@Bean
	public Employee  getEmp() {
		Employee employee= new Employee();
		employee.setId(100);
		employee.setName("Hemadri");
		return employee;
	}
}
