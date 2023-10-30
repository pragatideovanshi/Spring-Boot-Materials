package SpringJDBC.Dao;

import java.util.List;

import SpringJDBC.Entity.Student;

public interface StudentDao {
	
	public int insert(Student s);
	
	public int update(Student s);
	
	public int delete(Student s);
	
	public Student getbyId(int id);
	
	public List<Student> getall();

}
