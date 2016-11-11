package Test;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Driver;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class PatientUI  {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_7;
	//private JPanel panelMain;
	private JPanel addPanel;
	private JPanel searchPanel ;
	private JTextField textField;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientUI window = new PatientUI();
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
	public PatientUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 831, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel homePanel = new JPanel();
		homePanel.setBackground(new Color(176, 196, 222));
		frame.getContentPane().add(homePanel, "name_196719312612489");
		homePanel .setVisible(true);


		addPanel = new JPanel();
		addPanel.setBackground(new Color(176, 196, 222));
		frame.getContentPane().add(addPanel, "name_196727655918713");
		addPanel.setLayout(null);
		homePanel .setVisible(false);
		
		
		searchPanel = new JPanel();
		searchPanel.setBackground(new Color(176, 196, 222));
		frame.getContentPane().add(searchPanel, "name_196731797739741");
		searchPanel.setLayout(null);
		searchPanel.setVisible(false);
			
			
		
		JButton btnaddpatientNewButton = new JButton("Add Patient");
		Image Img2 = new ImageIcon(this.getClass().getResource("/add1.png")).getImage();
		btnaddpatientNewButton.setIcon(new ImageIcon(Img2));
		btnaddpatientNewButton.setBounds(146, 150, 206, 54);
		btnaddpatientNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		  addPanel.setVisible(true);
		  homePanel.setVisible(false);
			}
			
		});
		homePanel.setLayout(null);
		homePanel.add(btnaddpatientNewButton);
		
		JButton btnSearchNewButton_1 = new JButton("Search");
		Image Img1 = new ImageIcon(this.getClass().getResource("/Search1.png")).getImage();
		btnSearchNewButton_1.setIcon(new ImageIcon(Img1));
		btnSearchNewButton_1.setBounds(460, 150, 206, 54);
		try {
			btnSearchNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					searchPanel.setVisible(true);
					  homePanel.setVisible(false);
				}
			});
		} catch (Exception e1) {
			System.out.println(e1);
			e1.printStackTrace();
		}
		homePanel.add(btnSearchNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(6, 228, 819, 356);
		homePanel.add(scrollPane);
		
		JLabel lblCurentPatientList = new JLabel("Curent Patient List");
		lblCurentPatientList.setBounds(6, 211, 124, 16);
		homePanel.add(lblCurentPatientList);
		
		JLabel labelLogo = new JLabel("");
		Image Img = new ImageIcon(this.getClass().getResource("/Sacred.jpg")).getImage();
		labelLogo.setIcon(new ImageIcon(Img));
		labelLogo.setBounds(31, -16, 840, 162);
		homePanel.add(labelLogo);
		
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(68, 166, 75, 16);
		addPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(517, 166, 66, 16);
		addPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Birth");
		lblNewLabel_3.setBounds(68, 245, 84, 16);
		addPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Height");
		lblNewLabel_4.setBounds(300, 245, 51, 16);
		addPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Weight");
		lblNewLabel_5.setBounds(517, 245, 51, 16);
		addPanel.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 182, 130, 26);
		addPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(300, 182, 130, 26);
		addPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(517, 182, 130, 26);
		addPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(68, 261, 130, 26);
		addPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(517, 261, 130, 26);
		addPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Add Patient");
		lblNewLabel_11.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(266, 49, 199, 67);
		addPanel.add(lblNewLabel_11);
		
		//String [] patPriority= {"None", "Low", "Medium", "High"};
		
		JButton btnSubmit = new JButton("Submit");
		Image Img5 = new ImageIcon(this.getClass().getResource("/check.png")).getImage();
		btnSubmit.setIcon(new ImageIcon(Img5));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String fNameText  =  textField_1.getText();
				final String mNameText  =  textField_2.getText();
				final String lNameText  =  textField_3.getText();
				final String dobText    =  textField_4.getText();
				final String weightText =  textField_5.getText();
				final String heightText =  textField_12.getText();
				final String streetText =  textField_9.getText();
				final String cityText 	=  textField_10.getText();
				final String stateText  =  textField_11.getText();
				
				boolean success = false;
				//try {
					//Driver.addEntry(fNameText, lNameText, mNameText, streetText, cityText, stateText, heightText, weightText, dobText);
					//success = true;
				//} catch (Exception e1) {
				//	e1.printStackTrace();
				//}
				
				if(success){
					JOptionPane.showMessageDialog(frame, "Entry Added!");
				}
				/*
				Driver.setPat_FName(fNameText);
				Driver.setPat_MName(mNameText);
				Driver.setPat_LName(lNameText);
				Driver.setPat_DOB(dobText);
				Driver.setPat_Height(heightText);
				Driver.setPat_Weight(weightText);
				Driver.setPat_City(cityText);
				Driver.setPat_State(stateText);
				Driver.setPat_StreetAddrs(streetText);
				*/
			}
		});
		btnSubmit.setBounds(276, 398, 185, 43);
		addPanel.add(btnSubmit);
		
		JButton btnBackToHome = new JButton("Home");
		btnBackToHome.setBackground(Color.LIGHT_GRAY);
		Image Img3 = new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		btnBackToHome.setIcon(new ImageIcon(Img3));
		btnBackToHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				homePanel.setVisible(true);  
				addPanel.setVisible(false);
					}
		});
		btnBackToHome.setBounds(6, 6, 130, 52);
		addPanel.add(btnBackToHome);
		
		
		//Search panel
		
		textField_9 = new JTextField();
		textField_9.setBounds(68, 329, 130, 26);
		addPanel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(300, 329, 130, 26);
		addPanel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(517, 329, 130, 26);
		addPanel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblStreetAddress = new JLabel("Street Address");
		lblStreetAddress.setBounds(68, 311, 98, 16);
		addPanel.add(lblStreetAddress);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(300, 311, 61, 16);
		addPanel.add(lblCity);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(517, 311, 61, 16);
		addPanel.add(lblState);
		
		textField_12 = new JTextField();
		textField_12.setBounds(300, 261, 130, 26);
		addPanel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setBounds(300, 166, 84, 16);
		addPanel.add(lblMiddleName);
		
		JLabel lblNewLabel_7 = new JLabel("Patient Search");
		lblNewLabel_7.setBounds(350, 6, 96, 16);
		searchPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("First Name");
		lblNewLabel_8.setBounds(250, 49, 96, 16);
		searchPanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Last Name");
		lblNewLabel_9.setBounds(250, 77, 66, 16);
		searchPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Date of Birth");
		lblNewLabel_10.setBounds(250, 105, 171, 16);
		searchPanel.add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(500, 44, 136, 26);
		searchPanel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(500, 72, 136, 26);
		searchPanel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(500, 100, 136, 26);
		searchPanel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblor = new JLabel("-OR-");
		lblor.setHorizontalAlignment(SwingConstants.CENTER);
		lblor.setBounds(350, 137, 96, 16);
		searchPanel.add(lblor);
		
		JLabel lblPatientId = new JLabel("Patient ID");
		lblPatientId.setBounds(250, 177, 61, 16);
		searchPanel.add(lblPatientId);
		
		textField = new JTextField();
		textField.setBounds(500, 172, 130, 26);
		searchPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit_1 = new JButton("Submit");
		Image Img4 = new ImageIcon(this.getClass().getResource("/check.png")).getImage();
		btnSubmit_1.setIcon(new ImageIcon(Img4));
			btnSubmit_1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
					
				}
				
				
				
			});
		btnSubmit_1.setBounds(300, 227, 185, 43);
		searchPanel.add(btnSubmit_1);
		
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setBounds(65, 292, 61, 16);
		searchPanel.add(lblResults);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(56, 310, 719, 177);
		searchPanel.add(scrollPane_1);
		
		JButton button = new JButton("Home");
		Image Img6 = new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		button.setIcon(new ImageIcon(Img6));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePanel.setVisible(true);  
				searchPanel.setVisible(false);
			}
		});
		btnBackToHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				homePanel.setVisible(true);  
				searchPanel.setVisible(false);
					}
		});
		button.setBounds(6, 6, 120, 59);
		searchPanel.add(button);
	}
}