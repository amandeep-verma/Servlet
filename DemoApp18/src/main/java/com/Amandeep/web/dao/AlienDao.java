package com.Amandeep.web.dao;

import java.sql.*;
import com.Amandeep.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginProject","root","Dingo@12");
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery("select * from alien where aid="+aid);
			if(res.next())
			{
				a.setId(res.getInt("aid"));
				a.setAname(res.getString("aname"));
				a.setTech(res.getString("tech"));
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return a;
	}
}
