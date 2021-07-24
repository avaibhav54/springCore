	package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/samosa.xml");
//		samosa s=(samosa) context.getBean("sa");
//		
//		pepsi p=(pepsi) context.getBean("pa");
//		System.out.println(s);
	context.registerShutdownHook();
//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
//System.out.println(p);
khsta k=(khsta) context.getBean("ka");
System.out.println(k);

	}

}
