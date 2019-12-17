package eg;

public class Product {

	private int id;
	private String name;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void printProduct() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Price = "+price);
	}
}



//Such class with private types and with appropriate setters and getters
//is called as encapsulated class or bean class or POJO(plain old java object)
//class or VO(Value Object) class or DTO(Data transfer Object) class or Model class. 
//


