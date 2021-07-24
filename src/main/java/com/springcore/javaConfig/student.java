package com.springcore.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("student")
public class student {
	@Autowired
	samosa sam;
	
public samosa getSam() {
		return sam;
	}

	public void setSam(samosa sam) {
		this.sam = sam;
	}

public void study()
{
	sam.display();
	System.out.println("student is studying");
}
}
