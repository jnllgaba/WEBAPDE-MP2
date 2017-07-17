package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import web.model.User;
import web.util.NicheDB;

public class UserDao {
	
	private Connection connection;
	
	public UserDao() {
		connection = NicheDB.getConnection();
	}
	
	public boolean addUser(User user) {
		try {
			String query = "INSERT INTO " + 
			User.TABLE + "(" + User.COL_FNAME + ", " +
			User.COL_LNAME + ", " + User.COL_USERNAME + ", " + 
			User.COL_PASSWORD + ", " + User.COL_DES + ") " +
			" VALUES (?, ?, ?, ?, ?)";
			
			System.out.println(user.toString());
			PreparedStatement statement;
			statement = connection.prepareStatement(query);;
			statement.setString(1, user.getFirst_name());
			statement.setString(2, user.getLast_name());
			statement.setString(3,  user.getUsername());
			statement.setString(4, user.getPassword());
			statement.setString(5,  user.getDescription());
			
			statement.executeUpdate();
			System.out.println("[" + getClass().getName() + "] INSERT SUCCESS!");
			return true;
		} catch (SQLException ev) {
			ev.printStackTrace();
			System.out.println("[" + getClass().getName() + "] INSERT FAILED!");
			return false;
		}
	}
	
	public boolean deleteUser(int userid) {
		try {
			String query = "DELETE FROM " +
			User.TABLE + " WHERE " +
			User.COL_ID + " = ?";
			
			PreparedStatement statement;
			statement = connection.prepareStatement(query);
			
			statement.setInt(1, userid);
			statement.executeUpdate();
			
			System.out.println("[" + getClass().getName() + "] DELETE SUCCESS!");
			return true;
		} catch (SQLException ev) {
			System.out.println("[" + getClass().getName() + "] DELETE FAILED!");
			ev.printStackTrace();
			return false;
		}
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List <User> users = new ArrayList <User>();
		
		try {
			ResultSet rs;
			
			String query = "SELECT * " +
							"FROM " + User.TABLE;
			PreparedStatement statement;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
			
			while(rs.next()) {
				users.add(toUser(rs));
			}
			System.out.println("[" + getClass().getName() + "] SELECT SUCCESS!");
		} catch (SQLException e) {
			System.out.println("[" + getClass().getName() + "] SELECT FAILED!");
			e.printStackTrace();
			return null;
		}
		
		return users;
	}

	private User toUser(ResultSet rs) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			int userid = rs.getInt(User.COL_ID);
			String fname = rs.getString(User.COL_FNAME);
			String lname = rs.getString(User.COL_LNAME);
			String username = rs.getString(User.COL_USERNAME);
			String password = rs.getString(User.COL_PASSWORD);
			String des = rs.getString(User.COL_DES);
			
			user = new User();
			user.setUserid(userid);
			user.setFirst_name(fname);
			user.setLast_name(lname);
			user.setUsername(username);
			user.setPassword(password);
			user.setDescription(des);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(user.toString());
		return user;
	}

	public User getUserById(int userId) {
		User user = null;
		try {
			ResultSet rs;
			
			String query = "SELECT * FROM " + User.TABLE +
						   " WHERE " + User.COL_ID + " = ?";
			
			PreparedStatement statement;
			statement = connection.prepareStatement(query);
			statement.setInt(1, userId);
			rs = statement.executeQuery();
			
			if(rs.next()) {
				user = toUser(rs);
			}
			System.out.println("[" + getClass().getName() + "] SELECT SUCCESS!");					
		} catch (SQLException e) {
			System.out.println("[" + getClass().getName() + "] SELECT FAILED!");
			e.printStackTrace();
		}
		return user;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try {
			String query = "UPDATE " + User.TABLE +
						   " SET " + User.COL_FNAME + " = ?," +
						   User.COL_LNAME + " = ?," + 
						   User.COL_USERNAME + " = ?," +
						   User.COL_PASSWORD + " = ?," +
						   User.COL_DES + " = ? " +
						   " WHERE " + User.COL_ID + " = ?";
			
			System.out.println(query);
			PreparedStatement statement;
			statement = connection.prepareStatement(query);
			
			statement.setString(1, user.getFirst_name());
			statement.setString(2,  user.getLast_name());
			statement.setString(3,  user.getUsername());
			statement.setString(4, user.getPassword());
			statement.setString(5, user.getDescription());
			statement.setInt(6,  user.getUserid());
			
			statement.executeUpdate();
			System.out.println("[" + getClass().getName() + "] UPDATE SUCCESS!");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("[" + getClass().getName() + "] UPDATE FAILED!");
			return false;
			
		}
		
	}
}
