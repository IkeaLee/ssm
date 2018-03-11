package com.neusoft.springmvc.bean;

public class Emp {
	private int empno;
	private String ename;
	private float sal;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
}
