package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
student st=(student) context.getBean("student");
System.out.println(st);
st.study();
	}

}
