package com.infy.pojo;

public class Listofemployee {
	public String employeenname;
	public int employeeid;
	public String employeeaddress;
	public int employeeDOB;
	public String employeeAadher;
	
	@Override
	public String toString() {
		return "Listofemployee [employeenname=" + employeenname + ", employeeid=" + employeeid + ", employeeaddress="
				+ employeeaddress + ", employeeDOB=" + employeeDOB + ", employeeAadher=" + employeeAadher
				+ ", employeelocation=" +  "]";
	}
	public String getEmployeenname() {
		return employeenname;
	}
	public void setEmployeenname(String employeenname) {
		this.employeenname = employeenname;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
	public int getEmployeeDOB() {
		return employeeDOB;
	}
	public void setEmployeeDOB(int employeeDOB) {
		this.employeeDOB = employeeDOB;
	}
	public String getEmployeeAadher() {
		return employeeAadher;
	}
	public void setEmployeeAadher(String employeeAadher) {
		this.employeeAadher = employeeAadher;
	}
	
}
