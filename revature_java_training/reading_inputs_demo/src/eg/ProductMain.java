package eg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of products you wish to add");
		int n = scanner.nextInt();
		List<Product> pList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter info for Product " + (i + 1));
			Product p = new Product();
			System.out.println("Enter id");
			// int id=scanner.nextInt();
			p.setId(scanner.nextInt());
			System.out.println("Enter Product Name");
			// String name=scanner.next();
			p.setName(scanner.next());
			// pList.add(new Product(id, name));
			pList.add(p);
		}
		System.out.println("Printing all the products added");
		System.out.println(pList);
	}

}