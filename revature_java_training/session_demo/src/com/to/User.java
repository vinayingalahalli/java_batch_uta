package com.to;

public class User {
private int id;
private String firstName;
private String lastName;
private String city;
private String degree;
private String college;
private float gpa;
private String orgname;
private float yoe;
private double current_salary;
private double expected_salary;
public User() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public float getGpa() {
	return gpa;
}
public void setGpa(float gpa) {
	this.gpa = gpa;
}
public String getOrgname() {
	return orgname;
}
public void setOrgname(String orgname) {
	this.orgname = orgname;
}
public float getYoe() {
	return yoe;
}
public void setYoe(float yoe) {
	this.yoe = yoe;
}
public double getCurrent_salary() {
	return current_salary;
}
public void setCurrent_salary(double current_salary) {
	this.current_salary = current_salary;
}
public double getExpected_salary() {
	return expected_salary;
}
public void setExpected_salary(double expected_salary) {
	this.expected_salary = expected_salary;
}
@Override
public String toString() {
	return "User [id=" + Math.random() + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", degree="
			+ degree + ", college=" + college + ", gpa=" + gpa + ", orgname=" + orgname + ", yoe=" + yoe
			+ ", current_salary=" + current_salary + ", expected_salary=" + expected_salary + "]";
}

}
