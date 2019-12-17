package eg3;

public class Main {

	public static void main(String[] args) {
	Team t1=new Team(100, "Kapil", "India");
		
		Player p=new Player(100, "Sachin", t1, 100);
		//p.printPlayer();
		printAnything(p);
		
		Player p1=new Player(101, "raj", t1, 99);
		System.out.println("\n");
		//p1.printPlayer();
		printAnything(p1);
		System.out.println("\n");
		Organization o=new Organization(999, "Revature");
		Employee e=new Employee(900000, "Mehrab", o, 10000.00);
		//e.printEmployee();
		printAnything(e);
		
		Person pr=new Person(121, "Vinay");
		printAnything(pr);
		
		printAnything(new Object());

	}
	
	
	
	public static void printAnything(Object o) {
		
		if(o instanceof Employee) {
			Employee e=(Employee)o;
			e.printEmployee();
		}else if(o instanceof Player) {
			Player p=(Player)o;
			p.printPlayer();
		}else if(o instanceof Person) {
			Person per=(Person)o;
			per.printPerson();
		}else {
			System.out.println("Its just Object");
		}
	}
	
	

}
