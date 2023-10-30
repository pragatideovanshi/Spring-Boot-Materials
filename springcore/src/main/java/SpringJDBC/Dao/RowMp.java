package SpringJDBC.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import SpringJDBC.Entity.Student;

public class RowMp implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setID(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setCity(rs.getString(3));
		s.setAge(rs.getInt(4));
		
		return s;
	}

}
