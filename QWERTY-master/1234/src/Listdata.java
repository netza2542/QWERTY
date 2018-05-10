import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.eclipse.jface.text.templates.GlobalTemplateVariables.User;

public class Listdata {

	private int Grade;
	private String Section;
	private int ID;
	
	public Listdata(int Grade, String Section, int ID)
	{
		this.Grade  = Grade;
		this.Section= Section;
		this.ID     = ID;
	}
	
	public int getgrade()
	{
		return Grade;
	}
	
	public String Section()
	{
		return Section;
	}
	
	public int ID()
	{
		return ID;
	}
	
	public Connection getConnection()
	{
		Connection con;
		try {
			con = DriverManager.getConnection("idbc:mysql://localhost/candidate", "root", "");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<User> usersList()
	{
		ArrayList<User> usersList = new ArrayList<User>();
		Connection connection = getConnection();
		String query = "SELECT * FROM `voter`";
		Statement st;
		ResultSet rs;
		
		try {
			st = connection.createStatement();
			rs = st.executeQuery(query);
			User user;
			while (rs.next())
			{
				user = new User ();
				usersList.add(user);
			}
		}	catch (Exception e) {
			e.printStackTrace();
		}
		return usersList;
	}
	
	public void Show_Users_In_JTable()
	{
		ArrayList<User> list = getUsersList();
		DefaultTableModel model = (DefaultTableModel) jTable_Display_Users.getModel();
		Object[] row = new Object[3];
		for(int i = 0; i < list.size(); i++)
		{
			row[0] = list.get(i).getGrade();
			row[1] = list.get(i).getSection();
			row[2] = list.get(i).getID();			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
