import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Database {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public Database()
	{
		try {
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidate" ,"voter", "");
				st = con.createStatement();
			}
			catch(Exception ex)
				{
					System.out.println("Error: "+ ex);
					
				}
		}
	public void getData() {
		try{
			String query = "select * from pos";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
		while(rs.next())	{
			String identity = rs.getString("Identity");
			String name = rs.getString("Name");
			String position = rs.getString("Position");
			System.out.println("ID: " +identity+ " " +"Name:  "  + name + " "+ "Position: " +position);
							}
	}
	catch(Exception ex) {
			System.out.println(ex);
		}
	}

	

public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
