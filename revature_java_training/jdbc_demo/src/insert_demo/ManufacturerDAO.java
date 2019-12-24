package insert_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dbutil.OracleConnection;

public class ManufacturerDAO {

	
	public int registerManufacturer(Manufacturer manufacturer) throws Exception {
		int c=0;
		try(Connection connection=OracleConnection.getConnection()){
			String sql="insert into manufacturer(mid,mname) values(?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, manufacturer.getMid());
			preparedStatement.setString(2, manufacturer.getMname());
			
			c=preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
		throw new Exception("Internal error occured");
		}
		return c;
		
	}
}
