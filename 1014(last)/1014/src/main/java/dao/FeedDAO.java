package dao;

import java.sql.*;
import java.util.*;
import javax.naming.*;

public class FeedDAO{
	
	public boolean insert(String uid, String ucon) throws NamingException, SQLException, ClassNotFoundException{
		
		try {
			
			String sql = "insert into feed (id, content) values(?, ?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
			PreparedStatement stmt = null;
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, uid);
			stmt.setString(2, ucon);
			
			int count = stmt.executeUpdate();
			return (count == 1)?true:false;
		}finally {
			
		}
	}
	/* ResultSet 타입보다 ArrayList 형식으로 처리하는 것이 일반적이다.
	public ResultSet getList() throws NamingException, SQLException, ClassNotFoundException{
		try {
			
			String sql = "select * from feed order by ts desc";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
			PreparedStatement stmt = null;
			stmt = conn.prepareStatement(sql);
			return stmt.executeQuery(sql);
			
		}finally {
			
		}
		
	}*/
	
	public ArrayList<FeedObj> getList() throws NamingException, SQLException, ClassNotFoundException{
		try {
			
			String sql = "select * from feed order by ts desc";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1234");
			PreparedStatement stmt = null;
			ResultSet rs = null;
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			ArrayList<FeedObj> feeds = new ArrayList<FeedObj>();
			while (rs.next()) {
				feeds.add(new FeedObj(rs.getString("id"), rs.getString("content"), rs.getString("ts")));
			}
			
			return feeds;
			
		}finally {
			
		}
	}

}