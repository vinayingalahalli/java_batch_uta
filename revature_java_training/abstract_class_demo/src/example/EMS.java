package example;

public abstract class EMS {

	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void calculateEmployeeSalary();
	public abstract void searchEmployee();
	
	public void commonEmployeeFeatures() {
		System.out.println("An employee as per ILL should be payed");
	}
	
}
