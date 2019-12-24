package insert_demo;

public class InsertMain {
	public static void main(String[] args) {
		Manufacturer manufacturer=new Manufacturer(910, "LG");
		ManufacturerDAO dao=new ManufacturerDAO();
		try {
			int c=dao.registerManufacturer(manufacturer);
			System.out.println(c+" record/s inserted successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
}
