package com.app.service.publisher;

import javax.xml.ws.Endpoint;

import com.app.service.HelloSoapImpl;

public class HelloPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8000/hello", new HelloSoapImpl());

	}

}
