package eg1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Accessing with MyClass");
		MyClass m = new MyClass();
		m.hello();
		m.hi();
		m.local();
		System.out.println(m.hashCode());
		m.drive();
		m.stop();
		m.common();

		System.out.println("\nAccessing with MyInterface");
		MyInterface i = new MyClass();
		i.hello();
		i.hi();
		i.common();
		System.out.println(i.hashCode());

		System.out.println("\nAccessing with Interface2");
		Interface2 i2 = new MyClass();
		i2.drive();
		i2.common();
		i2.stop();
		System.out.println(i2.hashCode());
	}

}
