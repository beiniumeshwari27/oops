package com.codegnan.oopexamples;

public class Employee3 {
		private int EmployeeId;
		private String name;
		private double salary;
		public Employee3(int EmployeeId,String name,double salary) {
			this.EmployeeId=EmployeeId;
			this.name=name;
			this.salary=salary;
		}
		public int getEmployeeId() {
			return EmployeeId;
		}
		public void setEmployeeId(int employeeId) {
			EmployeeId = employeeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			if(salary>0) {
			this.salary = salary;
		}else {
			System.out.println("Enter positive number");
		}
			
		}
		public void DisplayInfo() {
			System.out.println("Id: "+getEmployeeId()+"  name: "+getName()+"  salary: "+getSalary());
		}
		

	}


