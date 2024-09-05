package spring.api0;

import java.util.ResourceBundle;
import java.sql.*;
public class DBConnection {
	public static Connection getConnection() throws Exception {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        //Fill your code here
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection(url, username, password);
    }
}