package com.springcore;

public class student {

	private int sid;
	private String sName;
	private String sAddr;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddr() {
		return sAddr;
	}
	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}
	public student(int sid, String sName, String sAddr) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sAddr = sAddr;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sName=" + sName + ", sAddr=" + sAddr + "]";
	}
	
}
