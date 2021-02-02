// V-2
// Java DataBase Connectivity, performing a basic query
/*
 * 7 Steps to connect jdbc
 1. import -> java.sql
 2. load and register the driver -> mysqldriver (com.mysql.jdbc) | oracle driver
 3. create connection
 4. prepare the statement
 5. execute the query
 6. process the results
 7. Close the connections
 */

import java.sql.*; // 1. import -> java.sql
public class DemoClass1 {

	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/LoginProject";
		String username="root";
		String password="Dingo@12";
		String query = "Select * from Login where uname=\"amandeep\"";
		
		/* 
		 Class.forName() executes the static block of the class parameter being passed.
		 That static block inside the Driver class loads the driver.
		 */
		Class.forName("com.mysql.cj.jdbc.Driver"); //2. Load the driver
		
		Connection con = DriverManager.getConnection(url,username,password); //3. create the connection
		
		Statement st = con.createStatement(); //4. prepare the statement
		// ResultSet stores the result from executeUpdate(). executeUpdate() returns result set.
		ResultSet res = st.executeQuery(query); //5. Executing query.
		
		res.next(); // to shift the pointer to the next record to fetch the previous value
		
		String userdata = res.getString("uname")+" : "+res.getString("password"); //6. Process the result
		
		System.out.println(userdata);
		
		st.close(); //7. closing the statement
		con.close(); // closing the connection
	}
}
