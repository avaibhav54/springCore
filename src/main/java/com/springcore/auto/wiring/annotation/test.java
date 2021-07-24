package com.springcore.auto.wiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\springcore\\auto\\wiring\\annotation\\config.xml");
		employee e=(employee) context.getBean("emp");
		System.out.println(e);

	}

}
