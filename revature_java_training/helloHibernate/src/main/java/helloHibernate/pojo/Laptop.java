package helloHibernate.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Laptop implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "name",length = 150,nullable = false)
	private String model_name;
	private double cost;
	private String manufacturer_name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date manufactured_date;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String model_name, double cost, String manufacturer_name) {
		super();
		this.model_name = model_name;
		this.cost = cost;
		this.manufacturer_name = manufacturer_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getManufacturer_name() {
		return manufacturer_name;
	}

	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}

	public Laptop(int id, String model_name, double cost, String manufacturer_name) {
		super();
		this.id = id;
		this.model_name = model_name;
		this.cost = cost;
		this.manufacturer_name = manufacturer_name;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model_name=" + model_name + ", cost=" + cost + ", manufacturer_name="
				+ manufacturer_name + "]";
	}

}
