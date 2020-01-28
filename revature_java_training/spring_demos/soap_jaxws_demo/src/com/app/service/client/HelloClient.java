package com.app.service.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.app.service.HelloSoap;

public class HelloClient {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://localhost:8000/hello?wsdl");
		
		
		QName name=new QName("http://service.app.com/", "HelloSoapImplService");
		Service service=Service.create(url,name);
		HelloSoap h=service.getPort(HelloSoap.class);
		System.out.println(h.sayHello("Chetan"));

	}

}
