package spring.api0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HallDAO {
	public List<Hall> getAllHall(){
		List<Hall> list=new ArrayList<>();
		Connection con;
		try {
			con = DBConnection.getConnection();
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from hall");
			while(rs.next()) {
				list.add(new Hall(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5)));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
