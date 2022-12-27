//OBJECT-ORIENTED PROGRAMMING 
//10 DECEMBER 2020
//Frame 2
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Menu {
	
	JFrame frame;

	//main method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu mainMenu = new Menu();
					mainMenu.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//end of main method

	//initialize components
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//create main frame
		
		frame = new JFrame("Car Parking Management System");
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		//create menubar
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		menuBar.setFont(new Font("Open Sans", Font.PLAIN, 12));
		frame.setJMenuBar(menuBar);
		
		//create menu
		JMenu parkingMenu = new JMenu("Parking Form");
		parkingMenu.setFont(new Font("Open Sans", Font.PLAIN, 12));
		menuBar.add(parkingMenu);
		
		//create menu item
		JMenuItem parkingForm = new JMenuItem("New Parking Form");
		parkingForm.setBackground(SystemColor.menu);
		parkingForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Parking();
				Parking.main(null);
			}
		});
		parkingForm.setFont(new Font("Open Sans", Font.PLAIN, 12));
		parkingMenu.add(parkingForm);
		frame.getContentPane().setLayout(null);
		
		//create button to exit from application
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(UIManager.getColor("Button.disabledForeground"));
		btnExit.setBackground(UIManager.getColor("Button.darkShadow"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JButton frmMenu = new JButton();
				if(JOptionPane.showConfirmDialog(frmMenu, "Are you sure you want to exit the program?","Menu", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);	
				}
				 }
		});
		btnExit.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnExit.setBounds(475, 397, 101, 33);
		frame.getContentPane().add(btnExit);
		
	}//end of initializing
}//end of class
