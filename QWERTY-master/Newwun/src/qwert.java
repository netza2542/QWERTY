import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class qwert {

	private JFrame frame;
	private JTextField txtHi;
	private Connection con;
    private Statement st;
    private ResultSet rs;
    
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qwert window = new qwert();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public qwert() {
		initialize();
		try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/candidate", "root", "");
            st = con.createStatement();
            String sql = ("SELECT * FROM voter;");
            ResultSet rs = st.executeQuery(sql);
            if (rs.next())
            {
            	String name = rs.getString("Name");
            	String position = rs.getString("Position");
            	int elementary = rs.getInt("Elementary");
            	int middle = rs.getInt("middle");
            	int highschool = rs.getInt("highschool");
            	int grade1 = rs.getInt("grade1");
            	int grade2 = rs.getInt("grade2");
            	int grade3 = rs.getInt("grade3");
            	int grade4 = rs.getInt("grade4");
            	int grade5 = rs.getInt("grade5");
            	int grade6 = rs.getInt("grade6");
            	int grade7 = rs.getInt("grade7");
            	int grade8 = rs.getInt("grade8");
            	int grade9 = rs.getInt("grade9");
            	int grade10 = rs.getInt("grade10");
            	int grade11 = rs.getInt("grade11");
            	int grade12 = rs.getInt("grade12");
            	
            }
           con.close();
    }catch(Exception ex) {
        System.out.println("Error: " + ex);
    }
};
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		JButton btnNewButton = new JButton("Print\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				System.out.println();
		}
			});
		btnNewButton.setBounds(165, 114, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtHi = new JTextField();
		txtHi.setEnabled(false);
		txtHi.setHorizontalAlignment(SwingConstants.CENTER);
		txtHi.setFont(new Font("Tahoma", Font.PLAIN, 27));
		txtHi.setText("HI");
		txtHi.setBounds(125, 11, 169, 61);
		frame.getContentPane().add(txtHi);
		txtHi.setColumns(10);
	}
}

