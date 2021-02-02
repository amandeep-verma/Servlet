// V-3
// Printing the whole database using while loop

import java.sql.*; 
public class DemoClass2 {

	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/LoginProject";
		String username="root";
		String password="Dingo@12";
		String query = "Select * from Login";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection con = DriverManager.getConnection(url,username,password); 
		
		Statement st = con.createStatement(); 
		// ResultSet stores the result from executeQuery(). executeQuery() returns result set.
		ResultSet res = st.executeQuery(query); 
		
		String userdata;
		// rs.next() will return false if there is no next row, if there is it shifts the pointer to next row
		while(res.next())
		{
			userdata = res.getString("uname")+" : "+res.getString("password");
			System.out.println(userdata);
		}
		
		st.close();
		con.close(); 
	}
}
