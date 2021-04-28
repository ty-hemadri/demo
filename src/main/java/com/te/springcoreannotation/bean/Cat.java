package com.te.springcoreannotation.bean;

import com.te.springcoreannotation.interfac.Animal;

public class Cat implements Animal {

	public void eat() {
		System.out.println("cat is eating chicken");
		
	}

	public void speak() {
		System.out.println("meow... meow...");
		
	}

}
