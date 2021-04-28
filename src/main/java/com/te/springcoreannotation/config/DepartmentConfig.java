package com.te.springcoreannotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotation.bean.Department;

@Configuration
public class DepartmentConfig {
	@Bean("dev")
	public Department getDept()
	{
		Department department = new Department();
		department.setId(10);
		department.setDname("Dev");
		
		return department;
	}
	
	@Bean("hr")
//	@Primary
	
	public Department getDeptHr()
	{
		Department department = new Department();
		department.setId(20);
		department.setDname("Hr");
		
		return department;
	}
	
	@Bean("test")
	public Department getDeptTest()
	{
		Department department = new Department();
		department.setId(30);
		department.setDname("Test");
		
		return department;
	}

}
