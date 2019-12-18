package lambda_functional_java8;

public class LambdaExpressionMain {

	public static void main(String[] args) {
		
		HelloFunctional f=()->{
			System.out.println("Hello from Lambda");
		};
		f.hello();
		
		HelloFunctional f1=()->{
			System.out.println("Hello from Lambda Again");
		};
		f1.hello();
		
		Functional2 f2=(n)->{
			System.out.println("Hello "+n);
		};
		f2.hey("vinay");
		f2.hey("J");
		
		
		
		Sum s=(x,y,z)->{
			return x+y+z;
		};
		
		System.out.println(s.add(100, 20, 88));
		System.out.println(s.add(12, 22, 222288));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
