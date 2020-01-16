package helloHibernate.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Customer implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int cid;
	private String name;
	private int age;
	private long contact;
	@OneToOne(fetch = FetchType.LAZY)
	private Laptop laptop;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Customer(String name, int age, long contact, Laptop laptop) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", contact=" + contact + ", laptop="
				+ laptop + "]";
	}
	
	
}
