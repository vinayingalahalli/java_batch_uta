package com.app.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.app.service.HelloSoap")
public class HelloSoapImpl implements HelloSoap{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name+" Welcome to SOAP with JAX-WS";
	}

}
