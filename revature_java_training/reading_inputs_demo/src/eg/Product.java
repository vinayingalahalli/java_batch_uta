package eg;

public class Product {
private int id;
private String name;

public Product() {
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + "]";
}

public Product(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
