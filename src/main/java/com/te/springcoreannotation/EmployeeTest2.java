package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotation.bean.Employee;
import com.te.springcoreannotation.config.AllConfig;


public class EmployeeTest2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Employee employee= context.getBean(Employee.class);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDepartment().getId());
		System.out.println(employee.getDepartment().getDname());
	}

}
