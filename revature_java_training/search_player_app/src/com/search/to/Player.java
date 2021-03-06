package com.search.to;

import java.util.Date;

public class Player {
private String id;
private String name;
private Date dob;
private String city;
private String gender;
private Team team;
public Player() {
	// TODO Auto-generated constructor stub
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@Override
public String toString() {
	return "Player [id=" + id + ", name=" + name + ", dob=" + dob + ", city=" + city + ", gender=" + gender + ", team="
			+ team + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Team getTeam() {
	return team;
}
public void setTeam(Team team) {
	this.team = team;
}

}
