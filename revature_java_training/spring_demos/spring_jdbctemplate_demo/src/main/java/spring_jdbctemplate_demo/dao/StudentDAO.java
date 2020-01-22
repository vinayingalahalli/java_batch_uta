package spring_jdbctemplate_demo.dao;

import java.util.List;

import spring_jdbctemplate_demo.pojo.Student;

public interface StudentDAO {

	public void createStudent(Student student);
	public Student getStudentById(int id);
	public List<Student> getAllStudents();
}
