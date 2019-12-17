package compiler_static_overload_demo;

public class Calculator {

	
	public void add(int a,int b,int c) {
		System.out.println("Result of int,int,int = "+(a+b+c));
	}
	
	public int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	
	public void add(float f1,float f2) {
		System.out.println("float,float called result is : "+(f1+f2));
	}
	public void add(double f1,double f2) {
		System.out.println("double,double called result is : "+(f1+f2));
	}
	
}
