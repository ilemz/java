package dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.NamingException;

public class UserDAO {
	
	public boolean insert(String uid, String upass, String uname) throws NamingException, SQLException, ClassNotFoundException {
		
		//Connection conn = null;
		
		try {
			
			String sql = "insert into user (id, password, name) values(?, ?, ?)";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
			
			PreparedStatement stmt = null;
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, upass);
			stmt.setString(3, uname);			
			
			int count = stmt.executeUpdate();
			return (count > 0) ? true : false;
			
		} finally {
						
		}
		
	}
	
	public boolean exists(String uid) throws SQLException, ClassNotFoundException, NamingException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			
			String sql = "select id from user where id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,  uid);
			
			rs = stmt.executeQuery();
			return rs.next();
			
		} finally {
			
		}
		
	}
	
	public boolean delete(String uid) throws ClassNotFoundException, SQLException, NamingException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
		PreparedStatement stmt = null;
		
		try {
			
			String sql = "delete from user where id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,  uid);
			
			int count = stmt.executeUpdate();
			return (count > 0) ? true : false;
			
		} finally {
			
		}
		
	}
	
	public int login(String uid, String upass) throws NamingException, SQLException, ClassNotFoundException{

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql = "select id, password from user where id = ?";
			stmt=conn.prepareStatement(sql);
			stmt.setString(1,  uid);
			
			rs = stmt.executeQuery();
			
			if(!rs.next()) return 1;
			if(!upass.equals(rs.getString("password"))) return 2;
			
			return 0;
		}
		
		finally{
			
		}
	}

}
