package com.test.questions;

import java.util.HashSet;

public class Employee {

	int empId;
	String empName;
	int empSalary;
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null||(this.getClass()!=obj.getClass()))
			return false;
		Employee emp =(Employee) obj;
		return (empId==emp.empId)&&(empName!=null && (empName==emp.empName&&empName.equals(emp.empName)))&&(empSalary==emp.empSalary);
	}
	public static void main(String[] args) {
		HashSet<Employee> h=new HashSet<>();
		h.add(new Employee());
		h.add(new Employee());
		h.add(new Employee());
		h.add(new Employee());
		System.out.println(h);
	}
	
}
