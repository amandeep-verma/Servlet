// V6-7
// DAO(data access object) model

import java.sql.*;

public class DemoClass4 {

	public static void main(String[] args) throws Exception {

		LoginDao dao = new LoginDao();
		dao.connect();
		Login l1 = dao.getLogin("Manj");
		System.out.println(l1.password);

		Login l2 = new Login("Raja", "Murad");
		int rowsAffected = dao.add(l2);
		System.out.println("rows affected "+rowsAffected);
	}
}

class LoginDao {

	Connection con = null;

	public void connect() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginProject", "root", "Dingo@12");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int add(Login l) {
		String query = "Insert into Login values (?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, l.uname);
			pst.setString(2, l.password);
			int rowsAffected = pst.executeUpdate();
			return rowsAffected;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public Login getLogin(String uname) {
		Login a = new Login();
		a.uname = uname;

		try {
			String query = "Select password from Login where uname='" + uname + "'";
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery(query);
			res.next();
			String password = res.getString(1);
			a.password = password;
			return a;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

class Login {
	String uname;
	String password;

	public Login() {
	};

	public Login(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
}
