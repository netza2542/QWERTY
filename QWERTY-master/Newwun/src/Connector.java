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
				int grade1 = rs.getInt("Grade1");
				int grade2 = rs.getInt("Grade2");
				int grade3 = rs.getInt("Grade3");
				int grade4 = rs.getInt("Grade4");
				int grade5 = rs.getInt("Grade5");
				int grade6 = rs.getInt("Grade6");
				int grade7 = rs.getInt("Grade7");
				int grade8 = rs.getInt("Grade8");
				int grade9 = rs.getInt("Grade9");
				int grade10 = rs.getInt("Grade10");
				int grade11 = rs.getInt("Grade11");
				int grade12 = rs.getInt("Grade12");
				int total = rs.getInt("Total");
			System.out.printf("Name:%s  Position: %s ElementaryVote: %d MiddleVote: %d HighSchoolVote: %d Grade 1: %d Grade 2: %d Grade 3: %d Grade 4: %d Grade 5: %d Grade 6: %d Grade 7: %d Grade 8: %d Grade 9: %d Grade 10: %d Grade 11: %d Grade 12: %d Total Vote: %d" , name, position , elementary ,  middle , highschool , grade1 , grade2 , grade3 , grade4 , grade5 , grade6 , grade7 , grade8 , grade9 , grade10 , grade11 , grade12, total);
				
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	};

