package real_world_objects;

public class Flight {
private int id;
private String name;
private double cost;
private float ratings;
public Flight() {
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
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
}
public Flight(int id, String name, double cost, float ratings) {
	super();
	this.id = id;
	this.name = name;
	this.cost = cost;
	this.ratings = ratings;
}
@Override
public String toString() {
	return "Flight [id=" + id + ", name=" + name + ", cost=" + cost + ", ratings=" + ratings + "]";
}
//@Override
//public int compareTo(Flight o) {
//	Integer i1=this.id;
//	Integer i2=o.id;
//	return i1.compareTo(i2);
//}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Flight other = (Flight) obj;
	if (id != other.id)
		return false;
	return true;
}

}
