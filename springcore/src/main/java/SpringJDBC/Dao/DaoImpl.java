package SpringJDBC.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import SpringJDBC.Entity.Student;

public class DaoImpl implements StudentDao{
	
	public JdbcTemplate getJdbcimpl() {
		return jdbcimpl;
	}


	public void setJdbcimpl(JdbcTemplate jdbcimpl) {
		this.jdbcimpl = jdbcimpl;
	}


	private JdbcTemplate jdbcimpl;


	@Override
	public int insert(Student s) {
		// TODO Auto-generated method stub
		String q="insert into Person(Name,City,Age) values(?,?,?)";
		int result=jdbcimpl.update(q,s.getName(),s.getCity(),s.getAge());
		return result;
	}


	@Override
	public int update(Student s) {
		// TODO Auto-generated method stub
		String q="update Person set name=?,city=? where id=?";
		int result=jdbcimpl.update(q,s.getName(),s.getCity(),s.getID());
		return result;
	}


	@Override
	public int delete(Student s) {
		// TODO Auto-generated method stub
		String q="delete from Person where id=?";
		int result=jdbcimpl.update(q,s.getID());
		return result;
	}


	@Override
	public Student getbyId(int id) {
		// TODO Auto-generated method stub
		String q="Select * from Person where id=?";
		RowMapper<Student> row=new RowMp();
		Student st=jdbcimpl.queryForObject(q, row,id);
		return st;
	}


	@Override
	public List<Student> getall() {
		// TODO Auto-generated method stub
		String q="Select * from Person";
		RowMapper<Student> row=new RowMp();
		List<Student> st=jdbcimpl.query(q, row);
		return st;
	}
	

}