package com.te.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.springcoreannotation.interfac.Animal;

import lombok.Data;

@Data
public class Pet {
   
	private String name;
	@Autowired
	private Animal animal;
}
