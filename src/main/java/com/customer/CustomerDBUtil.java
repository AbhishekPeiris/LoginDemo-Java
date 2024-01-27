package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stat = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username , String password) {
		
		try {
			
			con = DBConnect.getConnection();
			stat = con.createStatement();
			
			String sql = "select * from hotel.customer where username='"+username+"' and password='"+password+"'";
			rs = stat.executeQuery(sql);
			
			if(rs.next()) {
				
				isSuccess = true;
			}
			else {
				
				isSuccess = false;
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Customer> getCustomer(String username){
		
		ArrayList<Customer> customer = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stat = con.createStatement();
			
			String sql = "select * from hotel.customer where username='"+username+"'";
			rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userName = rs.getString(5);
				String password = rs.getString(6);
				
				Customer cus = new Customer(id,name,email,phone,userName,password);
				customer.add(cus);
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return customer;
	}

}
