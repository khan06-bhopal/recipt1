import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.JTextField;


public class receipt1 extends JFrame {

	private static JTable table;

	private JPanel contentPane;

	private JTable table_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receipt1 frame = new receipt1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		String url = "jdbc:mysql://localhost:3306/Cart1";
		String uname = "khan";
		String pass = "Bhopal@06";
		String query= "Select * from  customer";
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,uname,pass);
			PreparedStatement pst= conn.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
	       
	}
			catch(Exception e){
				e.printStackTrace();
				}
	}

	/**
	 * Create the frame.
	 */
	public receipt1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 54, 703, 104);
		contentPane.add(textArea);
		textArea.setText("\t *****************************************************************************"+"\n\t");
		textArea.setText(textArea.getText()+"\t   Address        \t");
		textArea.setText(textArea.getText()+"\t\tphone number             \n\n");
		textArea.setText(textArea.getText()+"\t\t City center vishal mega mart indore                  \n");
		textArea.setText(textArea.getText()+"\t*****************************************************************************"+"\n\n");
	
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 43, 721, 0);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 43, 53, 0);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 58, 758, 0);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 56, 712, 0);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(20, 53, 703, 62);
		contentPane.add(separator_4);
		
		JLabel lblNewLabel = new JLabel("ELECTRONIC SHOP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(285, 21, 226, 14);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(20, 153, 703, 104);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(20, 255, 702, 280);
		contentPane.add(table_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(20, 537, 702, 106);
		contentPane.add(textArea_1);
		textArea_1.setText("\t *****************************************************************************"+"\n");
		textArea_1.setText(textArea_1.getText()+"\t\t thank you visit again");
	
	}
}
