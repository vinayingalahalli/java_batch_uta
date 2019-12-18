package lambda_functional_java8;

@FunctionalInterface
public interface HelloFunctional {

	void hello();
	//void hey();
	
	//from java8
	public static void hi() {
		System.out.println("Hi from static method from Java8");
	}
	
	default void iAmDefault() {
		System.out.println("Default method from Java8");
	}
}
