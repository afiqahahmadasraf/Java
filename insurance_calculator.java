package afiqah_cw2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class calculator{
	//Variable declaration
	private JFrame frame;
	private JTextField amountText;
	private JTextField yearsText;
	private JTextField rateText;
	protected double formula;

	//Main method
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//End of main method

	//Application
	public calculator() {
		initialize();
	}

	//Initialize buttons, labels and text fields
	private void initialize() {
		//Main frame
		frame = new JFrame();
		frame.setTitle("Insurance Calulator");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 458, 682);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		//Display "INSURANCE CALCULATOR" label on frame
		JLabel label = new JLabel("INSURANCE CALCULATOR");
		label.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 20));
		label.setForeground(Color.WHITE);
		label.setBounds(116, 21, 223, 41);
		frame.getContentPane().add(label);
		
		//Display "Amount Deposited:" label on frame
		JLabel label1 = new JLabel("Amount Deposited:");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		label1.setBounds(38, 199, 141, 27);
		frame.getContentPane().add(label1);
		
		//Display "Years to Mature:" label on frame
		JLabel label2 = new JLabel("Years to Mature:");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		label2.setBounds(38, 268, 124, 34);
		frame.getContentPane().add(label2);
		
		//Display "Interest Rate:" label on frame
		JLabel label3 = new JLabel("Interest Rate:");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		label3.setBounds(38, 336, 98, 41);
		frame.getContentPane().add(label3);
		
		//Display instructions to use(1) label on frame
		JLabel label4 = new JLabel("Please enter the amount deposited, years to mature and");
		label4.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		label4.setForeground(Color.WHITE);
		label4.setBounds(38, 21, 415, 117);
		frame.getContentPane().add(label4);
		
		//Display instructions to use(2) label on frame
		JLabel label5 = new JLabel("the interest rate to calculate the total after 15 years.");
		label5.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
		label5.setForeground(Color.WHITE);
		label5.setBounds(48, 87, 364, 51);
		frame.getContentPane().add(label5);
		
		//Create text field to enter the amount
		amountText = new JTextField();
		amountText.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		amountText.setForeground(Color.BLACK);
		amountText.setBackground(new Color(255, 153, 153));
		amountText.setBounds(177, 205, 131, 19);
		frame.getContentPane().add(amountText);
		amountText.setColumns(10);
		
		//Create text field to enter the years
		yearsText = new JTextField();
		yearsText.addKeyListener(new KeyAdapter() {
			@Override
			//Ensure only numbers can be entered in text field
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		yearsText.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		yearsText.setForeground(Color.BLACK);
		yearsText.setBackground(new Color(255, 153, 153));
		yearsText.setBounds(154, 278, 37, 19);
		frame.getContentPane().add(yearsText);
		yearsText.setColumns(10);
		
		//Create text field to enter the rate
		rateText = new JTextField();
		rateText.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		rateText.setForeground(Color.BLACK);
		rateText.setBackground(new Color(255, 153, 153));
		rateText.setBounds(134, 349, 57, 19);
		frame.getContentPane().add(rateText);
		rateText.setColumns(10);
		
		//Display "Total Amount After 15 Years:" label on frame
		JLabel label6 = new JLabel("Total Amount After");
		label6.setFont(new Font("Franklin Gothic Book", Font.BOLD, 16));
		label6.setForeground(Color.WHITE);
		label6.setBounds(38, 487, 131, 13);
		frame.getContentPane().add(label6);
		
		//Create empty label to display the output
		JLabel output = new JLabel("");
		output.setForeground(Color.WHITE);
		output.setFont(new Font("Segoe UI", Font.BOLD, 16));
		output.setBounds(237, 479, 175, 27);
		frame.getContentPane().add(output);
		
		//Create empty label to display the number of years
		JLabel yearLabel = new JLabel("");
		yearLabel.setForeground(new Color(255, 153, 153));
		yearLabel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 16));
		yearLabel.setBounds(169, 487, 22, 13);
		frame.getContentPane().add(yearLabel);
		
		//Display "Years:" label on frame
		JLabel label7 = new JLabel("Years:");
		label7.setFont(new Font("Franklin Gothic Book", Font.BOLD, 16));
		label7.setForeground(Color.WHITE);
		label7.setBounds(192, 485, 45, 17);
		frame.getContentPane().add(label7);
				
		//Create calculateBtn to Calculate the total
		JButton calculateBtn = new JButton("Calculate");
		calculateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Show error message if text fields are empty
				if(amountText.getText().equals("") || yearsText.getText().equals("") || rateText.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please fill in all the requirements");
				}
				
				//Display number of years
				yearLabel.setText(yearsText.getText());
				
				//Calculate the total
				double amount = Double.parseDouble(amountText.getText());
				double years = Double.parseDouble(yearsText.getText());
				double rate = Double.parseDouble(rateText.getText());
				
                formula = ((amount*rate*years)/100)+ amount;
				
                //Display output
				output.setText(String.format("RM"+"%.2f", formula));
			}
		});
		calculateBtn.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		calculateBtn.setBackground(new Color(255, 153, 153));
		calculateBtn.setBounds(267, 402, 117, 40);
		frame.getContentPane().add(calculateBtn);
		
		//Create resetBtn to clear all text fields
		JButton resetBtn = new JButton("Reset");
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				amountText.setText(null);
				yearsText.setText(null);
				rateText.setText(null);
				output.setText(null);
				yearLabel.setText(null);
			}
		});
		resetBtn.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		resetBtn.setBackground(new Color(255, 153, 153));
		resetBtn.setBounds(74, 402, 117, 40);
		frame.getContentPane().add(resetBtn);
		
		//Create resetBtn to clear all text fields and output label
		JButton recalculateBtn = new JButton("Recalculate");
		recalculateBtn.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		recalculateBtn.setBackground(new Color(255, 153, 153));
		recalculateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				amountText.setText(null);
				yearsText.setText(null);
				rateText.setText(null);
				output.setText(null);
				yearLabel.setText(null);
			}
		});
		recalculateBtn.setBounds(169, 538, 117, 41);
		frame.getContentPane().add(recalculateBtn);
		
		//Create exitBtn to exit the program
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitBtn.setBackground(new Color(255, 153, 153));
		exitBtn.setFont(new Font("Leelawadee UI", Font.BOLD, 13));
		exitBtn.setBounds(364, 604, 70, 31);
		frame.getContentPane().add(exitBtn);
	} //End of initialization 
} //End of class
