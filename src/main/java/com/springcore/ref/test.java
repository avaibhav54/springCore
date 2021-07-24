package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/ref.xml");
		A temp=(A) context.getBean("aref");
		System.out.println(temp);
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());
		
		A t2=(A) context.getBean("a2ref");
		System.out.println(t2);
		}

}
