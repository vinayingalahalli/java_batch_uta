package eg;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();  //nextLong,nextByte,nextFloat
		System.out.println("Enter Gender(m/f/o)");
		char gender=sc.next().charAt(0);
		System.out.println("Enter designation");
		String desig=sc.next();
		System.out.println("Enter contact");
		long contact=sc.nextLong();
		System.out.println("Hello "+name);
		System.out.println("Age "+age);
		System.out.println("Salary "+salary);
		System.out.println("Gender "+gender);
		System.out.println("Desig "+desig);
		System.out.println("contact "+contact);
	}

}
