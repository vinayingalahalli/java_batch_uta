package compiler_static_overload_demo;

public class Main {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(12.5f, 12.333f);
		c.add(13333.33, 11.11);
		System.out.println("(int,int,int,int)"+c.add(11, 44, 55, 7));
		c.add(11, 88, 99);
	}

}
