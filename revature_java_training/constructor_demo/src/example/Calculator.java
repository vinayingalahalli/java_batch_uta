package example;

public class Calculator {

	int a;
	int b;
	int c;
	
 public Calculator(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

public Calculator(String name) {
	 System.out.println("Name : "+name);
 }
 
 public Calculator(int a,int b) {
	 this();
	 this.a=a; //variable shadowing
	 this.b=b;
 }
 public Calculator() {
	System.out.println("Empty constructor");
 }
 public int add() {
	 return a+b;
 }
 
}
