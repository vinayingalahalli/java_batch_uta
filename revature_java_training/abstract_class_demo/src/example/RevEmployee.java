package example;

public class RevEmployee extends RevatureEmployer{

	@Override
	public void requirement1() {
		// TODO Auto-generated method stub
		System.out.println("Requirement1 accomplished for RevEmp");
	}

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Rev Emp added to MongoDB");
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Rev EMP updated in MongoDB");
	}

	@Override
	public void calculateEmployeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("Rev Emp salary calculated and stored in MongoDb");
	}

	@Override
	public void searchEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Rev Emp retrived from MongoDB");
	}

}
