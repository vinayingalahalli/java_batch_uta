package runtime_dynamic_override_demo;

public class MobileMain {

	public static void main(String[] args) {
		
		MobileV2 v2=new MobileV2();
		v2.calling();
		v2.displayMenu();
		v2.gaming();
		v2.textMessaging();
		v2.socialApps();
		System.out.println(v2.getClass());
		System.out.println(v2.hashCode());
	}

}
