package helloHibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import helloHibernate.pojo.Item;
import helloHibernate.pojo.Orders;

public class MainOnetoMany {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
//		Item i1=new Item("Cookies", 1.0);
//		Item i2=new Item("Cake", 2.2);
//		Orders o=new Orders();
//		o.getItemList().add(i1);
//		o.getItemList().add(i2);
//		i1.setOrder(o);
//		i2.setOrder(o);
//		session.save(i1);
//		session.save(i2);
//
//		session.save(o);
		
		Orders o1=(Orders) session.get(Orders.class, 40);
		System.out.println(o1.getOrderId());
		List<Item> iList=o1.getItemList();
		for(Item i:iList) {
			System.out.println(i.getItemName());
		}
		transaction.commit();
		session.close();
		factory.close();
	}

}
