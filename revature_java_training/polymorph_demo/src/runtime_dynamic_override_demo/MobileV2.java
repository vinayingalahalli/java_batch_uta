package runtime_dynamic_override_demo;

public class MobileV2 extends MobileV1 {

	public void gaming() {
		System.out.println("Gaming from V2");
	}
	
	public void socialApps() {
		System.out.println("Social n/w from V2");
	}
	@Override
	public void displayMenu() {
		//super.displayMenu();
		System.out.println("Menu in V2 appears to be in GRID view");
	}
}
