package eg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {

	public static void main(String[] args) {
		
		Connection connection=null;
		
		try {
			//Step 1 - Load Driver
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loaded");
			
			//Step2- Open Connection
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String username="java";
			String password="java";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection successfull");
			
			//Step3- Create Statement
			Statement statement=connection.createStatement();
			String sql="select id,name,price from product order by price";
			
			//Step4- Execute
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query executed");
			
			//Step5 - Process Results
			while (resultSet.next()) {
				System.out.print("Id = "+resultSet.getInt("id"));
				System.out.print(" Name = "+resultSet.getString("name"));
				System.out.println(" Price = "+resultSet.getDouble("price"));
			}
			System.out.println("results processed");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step6 - Close connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
