import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Connector {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public Connector(){
        try{
                Class.forName("com.mysql.jdbc.Driver");

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidate", "root", "");
                st = con.createStatement();

        	}
        		catch(Exception ex)
        		{
            System.out.println("Error: " + ex);
        		}
    		}
    
	public void getDataHigh() {
		try{
			
			String query = "select * from voter";
			rs = st.executeQuery(query);
			while(rs.next()){
				String name = rs.getString("Name");
				String position = rs.getString("Position");
				int elementary = rs.getInt("Elementary");
				int middle = rs.getInt("Middle");
				int highschool = rs.getInt("Highschool");
				int grade1 = rs.getInt("Grade 1");
				int grade2 = rs.getInt("Grade 2");
				int grade3 = rs.getInt("Grade 3");
				int grade4 = rs.getInt("Grade 4");
				int grade5 = rs.getInt("Grade 5");
				int grade6 = rs.getInt("Grade 6");
				int grade7 = rs.getInt("Grade 7");
				int grade8 = rs.getInt("Grade 8");
				int grade9 = rs.getInt("Grade 9");
				int grade10 = rs.getInt("Grade 10");
				int grade11 = rs.getInt("Grade 11");
				int grade12 = rs.getInt("Grade 12");
				int total = rs.getInt("Total");
			System.out.printf("%s%s" , name, position));
				
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	};

