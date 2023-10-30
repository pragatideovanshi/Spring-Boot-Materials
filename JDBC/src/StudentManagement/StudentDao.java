package StudentManagement;

import java.sql.*;

public class StudentDao {
	public static boolean InsertStToDB(student st) {
		boolean flag=false;
		Connection con=Cn.CreateCn();
		String q="Insert into Person(Name,City,Age) values(?,?,?)";
		//Prepared Statement
		try {
			PreparedStatement pq = con.prepareStatement(q);
			pq.setString(1,st.getName());
			pq.setString(2,st.getCity());
			pq.setInt(3,st.getAge());
			
			// Execute
			pq.executeUpdate(); // When data we are not expection to come
			flag=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public static boolean DeleteToDB(int value) {
		 boolean flag = false;
	        Connection cn = Cn.CreateCn();
	        String query = "delete from Person where ID=?";
	        try {
	            PreparedStatement pq = cn.prepareStatement(query);
	            pq.setInt(1, value);
	            pq.execute();
	            flag=true;

	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	        return flag;
	}
	public static void showdata(){
        boolean flag = false;
        Connection cn = Cn.CreateCn();
        String query = "Select * from Person";
        try {
            Statement s = cn.createStatement();
            ResultSet result=s.executeQuery(query); 
            while(result.next()){
                int id=result.getInt("ID");
                String Name=result.getString("Name");
                String City=result.getString("City");
                int Age=result.getInt("Age");
                System.out.println(id+" "+Name+" "+City+" "+Age);
            }
            flag=true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	public static void getbyid(int userid){
        Connection cn = Cn.CreateCn();
        String query = "Select * from Person where id=?";
        try {
            
            PreparedStatement preparedStatement = cn.prepareStatement(query);

            // Set the ID parameter in the prepared statement
            preparedStatement.setInt(1, userid);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a record was found and process the data
            if (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String city=resultSet.getString("City");
                int age=resultSet.getInt(4);// Represent 4column
                // Continue extracting other fields as needed

                // Process the data (e.g., display, use it in your application, etc.)
                System.out.println("Record found:");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("City: " + city);
                System.out.println("age: " + age);
            } else {
                System.out.println("No record found with ID: " );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
