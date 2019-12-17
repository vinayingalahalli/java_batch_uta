package eg3;

public class Organization {

	private int oid;
	private String orgName;
	public Organization() {
		// TODO Auto-generated constructor stub
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Organization(int oid, String orgName) {
		super();
		this.oid = oid;
		this.orgName = orgName;
	}
	
	public void printOrgDetails() {
		System.out.println("Org Details");
		System.out.println("Org Id : "+oid);
		System.out.println("Org Name : "+orgName);
	}
}
