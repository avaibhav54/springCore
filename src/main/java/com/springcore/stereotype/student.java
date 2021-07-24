package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class student {
	@Value("Vaibhav Agarwal")
private String sname;
	@Value("Amroha")
private String city;
	@Value("#{temp}")
	private List<String>address;
public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "student [sname=" + sname + ", city=" + city + "]";
}

}
