package eg1;

public class MyClass implements MyInterface,Interface2 {

	@Override
	public void hello() {
		System.out.println("hello from MyInterface");
		
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
	//	x++; static & final
		System.out.println("Hi from MyInterface x="+x);
	}
	
	public void local() {
		System.out.println("Local of MyClass");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Drive from Interface2");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop from Interface2");
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("Common for both interfaces");
	}

}
