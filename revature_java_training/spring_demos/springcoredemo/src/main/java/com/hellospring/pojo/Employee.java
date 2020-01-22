package com.hellospring.pojo;

import java.util.List;

public class Employee extends Person {

	private String orgName;
	private double salary;
	private Project project;
	private List<Address> addressList;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}



	@Override
	public String toString() {
		return "Employee [id = "+this.getId()+", name = "+this.getName()+", orgName=" + orgName + ", salary=" + salary + ", project=" + project + ", addressList="
				+ addressList + "]";
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	
	
}
