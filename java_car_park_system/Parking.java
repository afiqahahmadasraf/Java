//10 DECEMBER 2020
//Frame 3
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Parking {

	private JFrame frame;
	private JTextField plate;
	private JTextField duration;
	private JTable table;
	private int count = 0;
	private int count1 = 0;
	private ButtonGroup addCheckBox;
	int i = 0;
	double carPrice = 1.00; //rate of car fee per hour
	double motorPrice = 0.80; //rate of motorcycle fee per hour
	double lorryPrice = 1.20; //rate of lorry fee per hour
	double fee = 0;
	
	//main method
		public static void main(String[] args) {
			
			new Parking();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Parking form = new Parking();
						form.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}//end of main method

	//initialize components
	public Parking() {
		initialize();
	}

	//building the frame for Parking class
	private void initialize() {
		//main frame
		frame = new JFrame("Parking Form");
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		//picture label
		JLabel imageLabel1 = new JLabel("New label");
		Image image1 = new ImageIcon(this.getClass().getResource("/park.png")).getImage();
		
		//display "parking ticket" label on parking ticket
		JLabel parkingTicketLabel = new JLabel("Parking Ticket");
		parkingTicketLabel.setForeground(Color.BLUE);
		parkingTicketLabel.setBounds(83, 466, 91, 16);
		frame.getContentPane().add(parkingTicketLabel);
		
		//display fee on parking ticket
		JLabel feeTicket = new JLabel("");
		feeTicket.setForeground(Color.BLUE);
		feeTicket.setBounds(28, 621, 195, 23);
		frame.getContentPane().add(feeTicket);
		
		//display duration parked on parking ticket
		JLabel durationTicket = new JLabel("");
		durationTicket.setForeground(Color.BLUE);
		durationTicket.setBounds(28, 569, 191, 23);
		frame.getContentPane().add(durationTicket);
		
		//display license plate number on parking ticket
		JLabel licenseTicket = new JLabel("");
		licenseTicket.setForeground(Color.BLUE);
		licenseTicket.setBounds(28, 518, 191, 23);
		frame.getContentPane().add(licenseTicket);
		imageLabel1.setIcon(new ImageIcon(image1));
		imageLabel1.setBounds(83, 386, 78, 70);
		frame.getContentPane().add(imageLabel1);
		
		//parking ticket
		JLabel ticketLabel = new JLabel("");
		ticketLabel.setOpaque(true);
		ticketLabel.setForeground(Color.BLACK);
		ticketLabel.setBackground(Color.WHITE);
		ticketLabel.setBounds(24, 384, 203, 313);
		frame.getContentPane().add(ticketLabel);
		
		//display "Vehicle License Plate:" label on frame
		JLabel plateLabel = new JLabel("Vehicle License Plate:");
		plateLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		plateLabel.setBounds(26, 10, 145, 37);
		frame.getContentPane().add(plateLabel);
		
		//display "Vehicle Type:" label on frame
		JLabel typeLabel = new JLabel("Vehicle Type:");
		typeLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		typeLabel.setBounds(26, 57, 91, 37);
		frame.getContentPane().add(typeLabel);
		
		//display "Duration Parked (min):" label on frame
		JLabel durationParkedtext = new JLabel("Duration Parked (min):");
		durationParkedtext.setFont(new Font("Open Sans", Font.PLAIN, 14));
		durationParkedtext.setBounds(31, 143, 171, 37);
		frame.getContentPane().add(durationParkedtext);
		
	    //create textfield to enter license plate
		plate = new JTextField();
		plate.setBounds(192, 16, 203, 27);
		frame.getContentPane().add(plate);
		plate.setColumns(10);
		
		//ensure only one checkbox gets selected at a time
		addCheckBox = new ButtonGroup();
		//create checkboxes to select type of vehicle
		JCheckBox car = new JCheckBox("Car");
		car.setBackground(SystemColor.inactiveCaption);
		car.setFont(new Font("Open Sans", Font.PLAIN, 14));
		car.setBounds(123, 64, 120, 23);
		frame.getContentPane().add(car);
		addCheckBox.add(car);
		
		JCheckBox motorcycle = new JCheckBox("Motorcycle");
		motorcycle.setBackground(SystemColor.inactiveCaption);
		motorcycle.setFont(new Font("Open Sans", Font.PLAIN, 14));
		motorcycle.setBounds(123, 89, 120, 23);
		frame.getContentPane().add(motorcycle);
		addCheckBox.add(motorcycle);
		
		JCheckBox lorry = new JCheckBox("Lorry");
		lorry.setBackground(SystemColor.inactiveCaption);
		lorry.setFont(new Font("Open Sans", Font.PLAIN, 14));
		lorry.setBounds(123, 114, 120, 23);
		frame.getContentPane().add(lorry);
		addCheckBox.add(lorry);
		
		//create textfield to enter duration parked
		duration = new JTextField();
		duration.setColumns(10);
		duration.setBounds(212, 151, 59, 23);
		frame.getContentPane().add(duration);
		
		//display the money that needs to be paid
		JLabel displayAmount = new JLabel("");
		displayAmount.setFont(new Font("Open Sans", Font.PLAIN, 14));
		displayAmount.setBounds(192, 289, 91, 37);
		frame.getContentPane().add(displayAmount);
		
		//display total number of parking slots 
		JLabel totalText = new JLabel("150");
		totalText.setFont(new Font("Open Sans", Font.PLAIN, 14));
		totalText.setBounds(686, 551, 35, 37);
		frame.getContentPane().add(totalText);
		
		//display number of parking slots in use
		JLabel slotsInUse = new JLabel("0");
		slotsInUse.setFont(new Font("Open Sans", Font.PLAIN, 14));
		slotsInUse.setBounds(644, 598, 35, 37);
		frame.getContentPane().add(slotsInUse);
		
		//display number of parking slots available
		JLabel slotsAvailable = new JLabel("150");
		slotsAvailable.setFont(new Font("Open Sans", Font.PLAIN, 14));
		slotsAvailable.setBounds(664, 645, 35, 37);
		frame.getContentPane().add(slotsAvailable);
		
		//create table to display information/report
		table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = {"License Plate", "Duration (minutes)", "Fees"};
		Object[] row = new Object[3];
		model.setColumnIdentifiers(column);
		table.setModel(model);
				
		//create scrollpane & mouse listener
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				plate.setText(model.getValueAt(i, 0).toString());
				duration.setText(model.getValueAt(i, 1).toString());
			}
		});
		scrollPane.setBounds(555, 44, 482, 452);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);
		
		//create "submit" button to enter license plate and duration to system, display fee that needs to be paid, display slots in use & available
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display message if input is not entered
				if(plate.getText().equals("")||duration.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill in all the rquirements.");
				}
				
				int time = Integer.parseInt(duration.getText());
				
				//display fee according to the duration and vehicle fee
				if(time <= 60 && car.isSelected()) {
					fee = 1*carPrice;
				}
				else if(time <= 60 && motorcycle.isSelected()) {
					fee = 1*motorPrice;
				}
				else if(time <= 60 && lorry.isSelected()) {
					fee = 1*lorryPrice;
				}
				else if (time <= 120 && car.isSelected()) {
				    fee = 2*carPrice;
				}
				else if (time <= 120 && motorcycle.isSelected()) {
			    	fee = 2*motorPrice;
				}
				else if (time <= 120 && lorry.isSelected()) {
			    	fee = 2*lorryPrice;
			    }
				else if (time <= 180 && car.isSelected()) {
			    	fee = 3*carPrice;
			    }
				else if (time <= 180 && motorcycle.isSelected()) {
			    	fee = 3*motorPrice;
			    }
				else if (time <= 180 && lorry.isSelected()) {
			    	fee = 3*lorryPrice;
			    }
				else if (time <= 240 && car.isSelected()) {
			    	fee = 4*carPrice;
			    }
				else if (time <= 240 && motorcycle.isSelected()) {
			    	fee = 4*motorPrice;
			    }
				else if (time <= 240 && lorry.isSelected()) {
			    	fee = 4*lorryPrice;
			    }
				else if (time <= 300 && car.isSelected()) {
			    	fee = 5*carPrice;
			    }
				else if (time <= 300 && motorcycle.isSelected()) {
			    	fee = 5*motorPrice;
				}
				else if (time <= 300 && lorry.isSelected()) {
			    	fee = 5*lorryPrice;
			    }
				else if (time <= 360 && car.isSelected()) {
			    	fee = 6*carPrice;
			    }
				else if (time <= 360 && motorcycle.isSelected()) {
			    	fee = 6*motorPrice;
			    }
				else if (time <= 360 && lorry.isSelected()) {
			    	fee = 6*lorryPrice;
			    }
				else if (time <= 420 && car.isSelected()) {
			    	fee = 7*carPrice;
			    }
				else if (time <= 420 && motorcycle.isSelected()) {
			    	fee = 7*motorPrice;
			    }
				else if (time <= 420 && lorry.isSelected()) {
			    	fee = 7*lorryPrice;
			    }
				else if (time <= 480 && car.isSelected()) {
			    	fee = 8*carPrice;
			    }
				else if (time <= 480 && motorcycle.isSelected()) {
			    	fee = 8*motorPrice;
			    }
				else if (time <= 480 && lorry.isSelected()) {
			    	fee = 8*lorryPrice;
			    }
				else {
					fee = 9*1.20; //fixed rate for all vehicles that park for 9 to 15 hours
				}
				
				//display fee that needs to be paid
				String payFee = String.format("%.2f", fee);
				displayAmount.setText(String.valueOf("RM"+payFee));				
				
				//control amount of input/ sets a max of 15 hours per vehicle
				if (time >= 901) {
			    	JOptionPane.showMessageDialog(null, "A vehicle may only park for 15 hours. Please try again.");
			    	duration.setText(null);
			    }
			
				//add data to table (report)
			    row[0] = plate.getText();
				row[1] = duration.getText();
				row[2] = displayAmount.getText();
				model.addRow(row);
			
				//calculate how many slots are in use
				if (e.getSource() == submit) {
					count++;
					slotsInUse.setText(String.valueOf(count));
				}
				
				//calculate how many slots are available
				if (e.getSource() == submit) {
					count1++;
					slotsAvailable.setText(String.valueOf(150-count));
				}
				
				//control amount of input/ sets a max limit of 150 parking entries
				if(i >= 149) {
					submit.setEnabled(false);
				}
				i++;
				
				//clears parking ticket values
				licenseTicket.setText(null);
				durationTicket.setText(null);
				feeTicket.setText(null);
			}
		});
		submit.setFont(new Font("Open Sans", Font.PLAIN, 14));
		submit.setBounds(26, 211, 101, 33);
		frame.getContentPane().add(submit);
		
		//clears all input
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			plate.setText(null);
			duration.setText(null);
			car.setSelected(false);
			motorcycle.setSelected(false);
			lorry.setSelected(false);
			displayAmount.setText(null);
			}
		});
		reset.setFont(new Font("Open Sans", Font.PLAIN, 14));
		reset.setBounds(193, 211, 101, 33);
		frame.getContentPane().add(reset);
		
		//display "Total Amount Payable:" label on frame
		JLabel totalamounttext = new JLabel("Total Amount Payable:");
		totalamounttext.setFont(new Font("Open Sans", Font.PLAIN, 14));
		totalamounttext.setBounds(26, 289, 159, 37);
		frame.getContentPane().add(totalamounttext);
		
		//create button to print parking ticket
		JButton printTicket = new JButton("Print Ticket");
		printTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//to print ticket
				JOptionPane.showMessageDialog(null,"Ticket is printing..");
				String p = plate.getText();
				licenseTicket.setText("License Plate Number: " + p);
				String d = duration.getText();
				durationTicket.setText("Duration Parked: "+ d + " minutes");
				String f = displayAmount.getText();
				feeTicket.setText("Total Amount Payable: "+f);
				
				//clears all values
				plate.setText(null);
				duration.setText(null);
				car.setSelected(false);
				motorcycle.setSelected(false);
				lorry.setSelected(false);
				displayAmount.setText(null);
			}
		});
		printTicket.setFont(new Font("Open Sans", Font.PLAIN, 14));
		printTicket.setBounds(26, 336, 123, 33);
		frame.getContentPane().add(printTicket);
		
		//create "back" button to return to main menu
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Menu();
				Menu.main(null);
				}
		});
		btnBack.setFont(new Font("Open Sans", Font.PLAIN, 14));
		btnBack.setBounds(26, 707, 101, 33);
		frame.getContentPane().add(btnBack);
		
		//create button to check what the current time is
		JButton checkTime = new JButton("Check Current Time");
		checkTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			checkTime.setText(java.time.LocalTime.now() + "");
			}
		});
		checkTime.setFont(new Font("Open Sans", Font.PLAIN, 14));
		checkTime.setBounds(298, 144, 171, 34);
		frame.getContentPane().add(checkTime);
		
		//display "Daily Report" label on frame
		JLabel reportText = new JLabel("Daily Report");
		reportText.setFont(new Font("Open Sans", Font.PLAIN, 14));
		reportText.setBounds(744, 10, 91, 37);
		frame.getContentPane().add(reportText);
		
		//display "Slots in Use:" label on frame
		JLabel useLabel = new JLabel("Slots in Use:");
		useLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		useLabel.setBounds(555, 598, 91, 37);
		frame.getContentPane().add(useLabel);
		
		//display "Slots Available:" label on frame
		JLabel availableLabel = new JLabel("Slots Available:");
		availableLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		availableLabel.setBounds(555, 645, 108, 37);
		frame.getContentPane().add(availableLabel);
		
		//display "Total Parking Slots:" label on frame
		JLabel totalLabel = new JLabel("Total Parking Slots:");
		totalLabel.setFont(new Font("Open Sans", Font.PLAIN, 14));
		totalLabel.setBounds(555, 551, 134, 37);
		frame.getContentPane().add(totalLabel);
		
		//create delete button to delete entry
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent d) {
				int del = table.getSelectedRow();
				if (del > 0) {
					model.removeRow(del);
					JOptionPane.showMessageDialog(null, "Entry has been deleted.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Select a row.");
				}
			}
		});
		delete.setFont(new Font("Open Sans", Font.PLAIN, 14));
		delete.setBounds(936, 504, 101, 33);
		frame.getContentPane().add(delete);
		
	}//end of initializing
}//end of class