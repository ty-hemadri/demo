package com.te.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotation.bean.Cat;
import com.te.springcoreannotation.bean.Dog;
import com.te.springcoreannotation.interfac.Animal;

@Configuration
public class AnimalConfig {
  @Bean
//  @Primary
	public Animal getDog()
	{
		return new Dog();
	}
  @Bean
  @Primary
  public Animal getCat()
	{
		return new Cat();
	}
}
