package com.springcore.constructorInjextion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=
		new ClassPathXmlApplicationContext("com/springcore/constructorInjextion/conf.xml");
		person p=(person) context.getBean("person");
		System.out.println(p);

	}

}
