package com.practice.com.extra;

public class Employee {
	
	private String empName;
	private int empId;
	private String designation;
	private String mobileNum;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	public Employee(String empName, int empId, String designation, String mobileNum) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.designation = designation;
		this.mobileNum = mobileNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", designation=" + designation + ", mobileNum="
				+ mobileNum + "]";
	}
	
}
