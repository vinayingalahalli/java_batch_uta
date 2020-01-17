package helloHibernate.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import helloHibernate.pojo.Customer;
import helloHibernate.pojo.Laptop;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
//Laptop l1=new Laptop("X100", 111.99, "Samsung");
//Laptop l2=new Laptop("Z100", 121.99, "Apple");
////Laptop l3=new Laptop("X100", 111.99, "Samsung");
////Laptop l4=new Laptop("X100", 111.99, "Samsung");
////Laptop l5=new Laptop("X100", 111.99, "Samsung");
//session.save(l1);
//session.save(l2);
//
//Customer c1=new Customer("Dheeraj", 22, 1234567890l, l2);
//session.save(c1);
//Customer c2=new Customer("Mukesh", 23, 1234567899l, l2);
//session.save(c2);
//Customer c3=new Customer("Nancy", 29, 1234567790l, l1);
//session.save(c3);
//session.save(l3);
//session.save(l4);
//System.out.println(session.save(l5));

//		Laptop l=(Laptop) session.get(Laptop.class, 101);
//		System.out.println(l);
//		Laptop l=(Laptop) session.get(Laptop.class, 101);
////		System.out.println(l);
//		
//		l.setModel_name("Acer");
//		session.update(l);
		
//		Laptop l=new Laptop();
//		l.setId(100);
//		session.delete(l);
		
		
//		Customer c=(Customer) session.get(Customer.class, 21);
//		System.out.println("Before name");
//		System.out.println(c.getName());
//		System.out.println("After name");
//		System.out.println("Fetching laptop info");
//		System.out.println(c.getLaptop());
		
		Query query=session.createQuery("from Laptop");
		List<Laptop> laptopList=query.list();
		for(Laptop l:laptopList) {
			System.out.println(l);
		}
		
		query=session.createQuery("from Customer where age=:age"); //update, delete
		query.setInteger("age", 23);
		List<Customer> clist=query.list();
		for(Customer c:clist) {
			System.out.println(c.getName());
		}
		
		//Criteria & Restrictions
		transaction.commit();
		session.close();
		factory.close();
	}

}
