package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context	= new ClassPathXmlApplicationContext("com\\springcore\\standalone\\cconfi.xml");
		person x=context.getBean("emp2",person.class);
		System.out.println(x);
		System.out.println(x.getProperty().getClass().getName());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		person y=context.getBean("emp1",person.class);
		System.out.println(y);
	}

}
