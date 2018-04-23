import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Database2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Database2 window = new Database2();
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
	public Database2() {
		initialize();
	}
	
	POSConnect connect = new POSConnect();

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(110, 124, 108, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblGrade.setForeground(Color.BLACK);
		lblGrade.setBounds(137, 93, 108, 18);
		frame.getContentPane().add(lblGrade);
		
		textField_1 = new JTextField();
		textField_1.setBounds(361, 124, 146, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSection = new JLabel("Section\r\n");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSection.setBounds(408, 93, 73, 20);
		frame.getContentPane().add(lblSection);
		
		JButton btnVote = new JButton("Vote");
		btnVote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					connect.Jack(textField.getText(),textField_1.getText());
				

				}
				catch(Exception ex){
					System.out.println("Mark");
				
			};
				
				
			}
		});
		btnVote.setBounds(248, 315, 89, 23);
		frame.getContentPane().add(btnVote);
	}
}
