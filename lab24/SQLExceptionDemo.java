package lab24;
	import java.sql.*;
public class SQLExceptionDemo {
	    public static void main(String[] args) {
	        try 
	        {
	        	Connection conn = DriverManager.getConnection
	        			("jdbc:mysql://localhost:3306/mydatabase", "user", "password");
	        } catch (SQLException e) {
	            System.out.println("Database error: " + e.getMessage());
	        }
	    }
	}
