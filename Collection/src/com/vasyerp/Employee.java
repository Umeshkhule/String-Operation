package com.vasyerp;

public class Employee {
	int employeeId;
	String employeeName;
	float employeeSalary;
	String employeeAddress;
	public Employee(int employeeId, String employeeName, float employeeSalary, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeAddress=" + employeeAddress + "]";
	}	
}
