package com.te.springcoreannotation.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employee implements Serializable{
     public Employee()
     {
    	 
     }
     private int id;
     private String name;
     @Autowired(required = false)
     @Qualifier("test")
     private Department department;
}
