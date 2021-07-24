package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext contex=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo.xml");
student st=(student) contex.getBean("student");
System.out.println(st);
System.out.println("hello");
System.out.println(st.getAddress());


	}

}
