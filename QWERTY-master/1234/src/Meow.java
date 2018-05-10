import java.sql.Connection;
import java.sql.DriverManager;

public class Meow {
	Connection conn = DriverManager.getConnection("idbc:mysql://localhost/candidate", "root", "")
	
	System.out.printf(rs.getInt("Grade"), rs.getString("Section") , rs.getInt("ID"));
}
