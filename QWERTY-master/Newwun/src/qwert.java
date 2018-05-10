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
		
};
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Connector connect = new Connector();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		JButton btnNewButton = new JButton("Print\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				connect.getDataHigh();
				
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

