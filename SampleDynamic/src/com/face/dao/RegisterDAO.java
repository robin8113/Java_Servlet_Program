package com.face.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.face.bo.RegisterBO;

public class RegisterDAO {

	public static void save(Connection connection, RegisterBO obj) throws SQLException {
		// TODO Auto-generated method stub
		Statement st=(Statement) connection.createStatement();
		int result=st.executeUpdate("insert into stable(name,password,email,date)values('"+obj.getUname()+"','"+obj.getPass()+"','"+obj.getEmail()+"','"+obj.getDob()+"')");
		if(result==1)
		{
			System.out.println("data inserted successfully");
//			ResultSet rs=st.executeQuery("select * from stable");
//			System.out.println("after resultset");
//			System.out.println("Name:"+"\t"+"Password");
//			if(rs.next())
//			{
//				//System.out.println();
//				String name=rs.getString("name");
//				String password=rs.getString("password");
//				String eml=rs.getString("email");
//				String dob=rs.getString("date");
//				System.out.println(name+"\t"+password);
//			}
//		}
		}
		else
		{
			System.out.println("Error");
		}
	}

}
