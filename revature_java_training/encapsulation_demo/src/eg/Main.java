package eg;

public class Main {

	public static void main(String[] args) {
		Product p1=new Product();
	//	p1.id=100; //data leakage
		p1.setId(9000);
		p1.printProduct();
		Product p2=new Product(100, "Desktop", 10);
		p2.printProduct();
		
		System.out.println("Id = "+p2.getId());
		p2.setId(1001);
		p2.printProduct();

	}

}
