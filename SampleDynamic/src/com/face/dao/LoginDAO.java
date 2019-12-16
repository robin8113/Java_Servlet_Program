package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;

public class LoginDAO {

	public static Boolean save(Connection connection, LoginBO obj) throws SQLException {
		// TODO Auto-generated method stub
		
		Statement st=(Statement) connection.createStatement();
		String s="select * from stable where name='"+obj.getUsername()+"' and password='"+obj.getPassword()+"'";
		ResultSet rs=st.executeQuery(s);
		if(rs.next())
		{
			System.out.println("Login Successfull");
			obj.setUsername(rs.getString("name"));
			obj.setPassword(rs.getString("password"));
			obj.setEmail(rs.getString("email"));
			obj.setDate(rs.getString("date"));
			return true;
		}
		else
		{
			System.out.println("Login Unsuccessfull");
			return false;
		}
	}

}
