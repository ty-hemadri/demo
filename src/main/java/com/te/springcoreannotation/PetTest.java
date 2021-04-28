package com.te.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotation.bean.Employee;
import com.te.springcoreannotation.bean.Pet;
import com.te.springcoreannotation.config.AllConfig;
import com.te.springcoreannotation.config.PetConfig;

public class PetTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet= context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().speak();

	}

}
