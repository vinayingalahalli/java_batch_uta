package spring_jdbctemplate_demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import spring_jdbctemplate_demo.pojo.Student;

public class StudentDaoImpl implements StudentDAO{

	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate=new JdbcTemplate(this.dataSource);
	}
	
	public void createStudent(Student student) {
		String sql="insert into student(id,name,age) values(?,?,?)";
		jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAge());
		
	}

	public Student getStudentById(int id) {
		String sql="select id,name,age from student where id=?";
		Student student=jdbcTemplate.queryForObject(sql, new Object[] {id},new StudentMapper());
		return student;
	}

	public List<Student> getAllStudents() {
		String sql="select id,name,age from student";
		List<Student> studentList=jdbcTemplate.query(sql, new StudentMapper());
		return studentList;
	}


	


	



	


	

}
