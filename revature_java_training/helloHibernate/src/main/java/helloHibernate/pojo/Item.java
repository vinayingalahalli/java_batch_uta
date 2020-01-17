package helloHibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int itemId;
	private String itemName;
	private double cost;
	@ManyToOne
	@JoinColumn(name = "order_id", nullable = true)
	private Orders order;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Item(String itemName, double cost) {
		super();
		this.itemName = itemName;
		this.cost = cost;
	}
	
}
