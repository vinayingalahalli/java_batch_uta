package example;

public class Main {

	public static void main(String[] args) {
		Calculator c=new Calculator("Hello");
		
		Calculator c1=new Calculator(12, 10);
		
		System.out.println("Result : "+c1.add());
	}

}
