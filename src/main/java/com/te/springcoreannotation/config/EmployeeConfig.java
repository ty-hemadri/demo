package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotation.bean.Employee;

@Configuration
public class EmployeeConfig {
	
	
	@Bean
       public Employee getEmployee()
       {
    	   return new Employee();
       }
//	@Bean
//	@Primary
//	public Employee getEmp()
//	{
//		return new Employee(1, "Hkr");
//	}
}
