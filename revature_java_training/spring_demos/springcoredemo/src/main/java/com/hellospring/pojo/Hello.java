package com.hellospring.pojo;

public class Hello {

	public Hello() {
	System.out.println("Hello initialized");
	}
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
