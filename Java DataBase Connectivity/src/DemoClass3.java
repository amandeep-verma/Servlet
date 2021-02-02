// V-4
// database connectivity INSERT
/*
 There are 3 types of language is SQL -> 
 1. DDL (data definition language)
 2. DML (data manipulation language) - uses executeUpdate() - returns ResultSet(resultant)
 3. DQL (data query language) - uses executeQuery() - returns integer(number of rows affected)
 4. TCL (transaction control language)
 
 Instead of Statement, Prepared Statement can be used for dynamic data entry.
 REMEMBER in prepare statement we pass the query in con.prepareStatement().
 */
import java.sql.*; 
public class DemoClass3 {

	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/LoginProject";
		String username="root";
		String password="Dingo@12";
		String query1 = "insert into Login values('Manj','Secret')"; // query1 for Statement
		
		String query2 = "insert into Login values(?,?)"; // query2 for Prepared Statement
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url,username,password); 
		
		Statement st1 = con.createStatement(); 
		// executeUpdate() returns the rows affected after executing query.
		int rowsAffected1 = st1.executeUpdate(query1); 
		System.out.println("1Total Row/s affected "+rowsAffected1);
		
		
		PreparedStatement st2 = con.prepareStatement(query2);
		st2.setString(1, "Rohit");
		st2.setString(2, "passw0rd");
		int rowsAffected2 = st2.executeUpdate(); 
		System.out.println("2Total Row/s affected "+rowsAffected2);
		
		
		st1.close();
		st2.close();
		con.close(); 
	}
}
