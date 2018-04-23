import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class POSConnect {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public POSConnect ()
		{
		try {
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://172.16.106.18:3306/voter" + "user=admin&password=123", "");
				st = con.createStatement();
			}
			catch(Exception ex)
				{
					System.out.println("Error: "+ ex);
					
				}
		}
	public String getData(String ref) {
		String name = "";
		try{
			String query = "select * from dawae";
			rs = st.executeQuery(query);
		while(rs.next())	{
			String idx = rs.getString("Reference");
			if (idx.equals(ref))
			{
				name = rs.getString("Name");
			}
			
		
							}
	}
	catch(Exception ex) {
			System.out.println(ex);
		}
		return name;
	}
	
	public String getId(String ref){
		String dame = "";
		try{
			String query = "select * from dawae";
			rs = st.executeQuery(query);
		while(rs.next())	{
			String Id = rs.getString("Reference");
			if (Id.equals(ref))
			{
				dame = rs.getString("Id");
			}
			
		
							}
	}
	catch(Exception ex) {
			System.out.println(ex);
		}
		return dame;
		
		
		
	}
	
public String getTotal(String ref){
	String jame = "";
		
		try{
			String query = "select * from dawae";
			rs = st.executeQuery(query);
		while(rs.next())	{
			String Total = rs.getString("Reference");
			if (Total.equals(ref))
			{
				jame = rs.getString("Total");
			}
		
							}
	}
	catch(Exception ex) {
			System.out.println(ex);
		}
		return jame;
		
		
		
	}
public void FAG(String Grade, String Section)
{
	try{ String query = String.format("INSERT INTO `voter`(`Grade`, `Section`) VALUES ('%s','%s')" , Grade , Section, );
			Statement st = con.createStatement();
			st.executeLargeUpdate(query);
			
			
	}
		catch(Exception ex){
			System.out.print(ex);
		
			
		}
			
}

public void Jack(String Grade, String Section)
{
	try{ String query = String.format("INSERT INTO `voter`(`Grade`, `Section`) VALUES ('%s','%s')" ,Grade,Section);
			Statement st = con.createStatement();
			st.executeLargeUpdate(query);
			
			
	}
		catch(Exception ex){
			System.out.print(ex);
		
			
		}
			
}
public void Del(String FIRSTNAME)
	{
	try { String query = String.format("DELETE FROM `ching` WHERE `ching`.`FIRSTNAME` = '%s'", FIRSTNAME);
			Statement st = con.createStatement();
					st.executeLargeUpdate(query);
		}
	
		catch(Exception ex) 
		{
			System.out.print(ex);
		}


	
	}


public int Log(String user)
{
	int Id = "";
	
	try{ String query = "select * from user";
	Statement st = con.createStatement();
	st.executeQuery(query);
	while (rs.next()){
		String loggy = rs.getString("user");
		if (loggy.equals(user))
		{
			Id = rs.getString("Id");
		}
	}
	
	}
	catch(Exception ex) 
	{
		System.out.print(ex);
	}
	return Id;
}
public String Pass(String password)
{
	String Id = "";
	
	try{ String query = "select * from password";
	Statement st = con.createStatement();
	st.executeQuery(query);
	while (rs.next()){
		String passy = rs.getString("password");
		
		if (passy.equals(password))
		{
			Id = rs.getString("Id");
		}
	}
	
	}
	catch(Exception ex) 
	{
		System.out.print(ex);
	}
	return Id;
}
	
}