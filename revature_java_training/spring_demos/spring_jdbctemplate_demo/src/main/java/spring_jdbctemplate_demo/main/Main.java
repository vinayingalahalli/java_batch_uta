package spring_jdbctemplate_demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_jdbctemplate_demo.dao.StudentDAO;
import spring_jdbctemplate_demo.pojo.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("jdbcbean.xml");
		
		StudentDAO dao=(StudentDAO) context.getBean("dao");
		
//		Student s1=new Student(90002, "James", 22);
//		dao.createStudent(s1);
//		dao.createStudent(new Student(90003, "Ann", 29));
//		dao.createStudent(new Student(90004, "Suzane", 22));
//		dao.createStudent(new Student(90005, "Rajesh", 28));
		System.out.println(dao.getAllStudents());
		
		System.out.println(dao.getStudentById(90003));

	}

}
