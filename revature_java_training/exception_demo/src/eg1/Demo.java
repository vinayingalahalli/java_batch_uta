package eg1;

public class Demo {

	public static void main(String[] args) {
		
		int a=10;
		int b=1;
		int res=0;
		try {
		res=a/b;
		String s=null;
		System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}catch(NullPointerException e) {
			System.out.println("Something is empty");
		}
		finally {
			System.out.println("Result is "+res);
		}
		
		System.out.println("Print me too");

	}

}
