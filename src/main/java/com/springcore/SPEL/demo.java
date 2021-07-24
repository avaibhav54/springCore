package com.springcore.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class demo {
	@Value("40")
private int x;
	@Value("#{T(java.lang.Math).PI}")
private int y;
@Value("#{T(java.lang.Math).sqrt(25)}")	
private double z;

@Value("#{new java.lang.String('vaibhav agarwal')}")
private String name;

@Override
public String toString() {
	return "demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public double getZ() {
	return z;
}
public void setZ(double z) {
	this.z = z;
}



}
