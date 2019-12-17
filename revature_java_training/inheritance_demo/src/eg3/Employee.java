package eg3;

public class Employee extends Person {

	private Organization organization;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Organization organization, double salary) {
		super(id, name);
		this.organization = organization;
		this.salary = salary;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printEmployee() {
		System.out.println("Printing Employee Details");
		super.printPerson();
		System.out.println("Salary : "+salary);
		organization.printOrgDetails();
	}
	
}
