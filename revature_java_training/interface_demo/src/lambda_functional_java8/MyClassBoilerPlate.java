package lambda_functional_java8;

public class MyClassBoilerPlate implements HelloFunctional{

	@Override
	public void hello() {
		System.out.println("Hello Java7");
	}
	
	public static void main(String[] args) {
		HelloFunctional f=new MyClassBoilerPlate();
		f.hello();
	}

}
