//10 DECEMBER 2020
//Frame 1
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class Login {

	private JFrame frame;
	private JTextField user;
	private JPasswordField pass;
	
    //main method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//end of main method

	//initialize components
	public Login() {
		initialize();
	}

	private void initialize() {
		//create main frame
		frame = new JFrame("Login");
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		usernameLabel.setBounds(147, 62, 73, 13);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
		passwordLabel.setBounds(147, 107, 73, 13);
		frame.getContentPane().add(passwordLabel);
		
		//create textfield to input username
		user = new JTextField();
		user.setBounds(230, 60, 135, 19);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		//create passwordfield to input password
		pass = new JPasswordField();
		pass.setBounds(230, 105, 135, 19);
		frame.getContentPane().add(pass);
		
		//create button to login into main menu
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = user.getText();
				String password = pass.getText();
				if(username.equals("Admin") && password.equals("parkingsystem123")) {
					user.setText(null);
					pass.setText(null);
					new Menu();
					Menu.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid username or password, try again.");
					user.setText(null);
					pass.setText(null);
			}
			}
		});
		loginBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		loginBtn.setBounds(147, 165, 85, 21);
		frame.getContentPane().add(loginBtn);
		
		//create reset button to clear all input
		JButton resetBtn = new JButton("Reset");
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user.setText(null);
				pass.setText(null);
			}
		});
		resetBtn.setFont(new Font("Open Sans", Font.PLAIN, 13));
		resetBtn.setBounds(280, 166, 85, 21);
		frame.getContentPane().add(resetBtn);
		
		JLabel imageLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/p.png")).getImage();
		imageLabel.setIcon(new ImageIcon(image));
		imageLabel.setBounds(10, 62, 143, 127);
		frame.getContentPane().add(imageLabel);
		
	}//end of initializing
}//end of class
