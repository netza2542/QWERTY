import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Numb {

	private JFrame frame;
	private JTextField txtElectionReportFor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numb window = new Numb();
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
	public Numb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(btnPrint, BorderLayout.CENTER);
		
		txtElectionReportFor = new JTextField();
		txtElectionReportFor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtElectionReportFor.setText("                                Election Report for Year 2018");
		frame.getContentPane().add(txtElectionReportFor, BorderLayout.NORTH);
		txtElectionReportFor.setColumns(10);
	}

}
