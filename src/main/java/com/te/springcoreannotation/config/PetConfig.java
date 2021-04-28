package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcoreannotation.bean.Pet;
@Import({AnimalConfig.class})
@Configuration
public class PetConfig {

	@Bean
	public Pet getPetObject()
	{
		Pet pet=new Pet();
		pet.setName("johnny");
		return pet;
	}
}
