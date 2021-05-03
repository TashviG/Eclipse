//Author: Tashvi Gooroochurn
//Date:19/11/16
//Ques4
//Create a GUI application that calculates the total cost of a hotel stay
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ques4 {

	private JFrame frame;
	private JTextField textFieldHotel;
	private JTextField textFieldRestaurant;
	private JTextField textFieldRecreational;
	private JTextField textFieldGym;
	private JTextField textFieldService;
	
	final static int HotelStayPerDay=150;
	static int CalcStayCharges;
	static int CalcMiscCharges;
	static int CalcTotalCharges;
	
	//declare variables
	int DaysSpent;
	int RestaurantCharges;
	int RecreationalCharges;
	int Gymfees;
	int ServiceCharge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ques4 window = new Ques4();
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
	public Ques4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 858, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotel = new JLabel("No. of days spent in hotel:");
		lblHotel.setBounds(33, 28, 159, 16);
		frame.getContentPane().add(lblHotel);
		
		JLabel lblRestaurant = new JLabel("Amount of restaurant charges:");
		lblRestaurant.setBounds(33, 75, 181, 16);
		frame.getContentPane().add(lblRestaurant);
		
		JLabel lblRecreational = new JLabel("Amount of recreational charges:");
		lblRecreational.setBounds(33, 133, 191, 16);
		frame.getContentPane().add(lblRecreational);
		
		JLabel lblGym = new JLabel("Amount of gym fees:");
		lblGym.setBounds(33, 188, 131, 16);
		frame.getContentPane().add(lblGym);
		
		JLabel lblService = new JLabel("Amount of service charge:");
		lblService.setBounds(33, 254, 167, 16);
		frame.getContentPane().add(lblService);
		
		textFieldHotel = new JTextField();
		textFieldHotel.setBounds(262, 25, 116, 22);
		frame.getContentPane().add(textFieldHotel);
		textFieldHotel.setColumns(10);
		
		textFieldRestaurant = new JTextField();
		textFieldRestaurant.setBounds(262, 72, 116, 22);
		frame.getContentPane().add(textFieldRestaurant);
		textFieldRestaurant.setColumns(10);
		
		textFieldRecreational = new JTextField();
		textFieldRecreational.setBounds(262, 130, 116, 22);
		frame.getContentPane().add(textFieldRecreational);
		textFieldRecreational.setColumns(10);
		
		textFieldGym = new JTextField();
		textFieldGym.setBounds(262, 185, 116, 22);
		frame.getContentPane().add(textFieldGym);
		textFieldGym.setColumns(10);
		
		textFieldService = new JTextField();
		textFieldService.setBounds(262, 251, 116, 22);
		frame.getContentPane().add(textFieldService);
		textFieldService.setColumns(10);
		
		JLabel lblOutput = new JLabel("The Total Cost Of a hotel stay:");
		lblOutput.setBounds(490, 58, 338, 63);
		frame.getContentPane().add(lblOutput);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblOutput.setText("");
				
				//getting input from the user
				DaysSpent= Integer.parseInt(textFieldHotel.getText());
				RestaurantCharges= Integer.parseInt(textFieldRestaurant.getText());
				RecreationalCharges= Integer.parseInt(textFieldRecreational.getText());
				Gymfees= Integer.parseInt(textFieldGym.getText());
				ServiceCharge= Integer.parseInt(textFieldService.getText());
				
				//calculation
				CalcStayCharges= DaysSpent * HotelStayPerDay;
				CalcMiscCharges= RestaurantCharges + RecreationalCharges  +Gymfees + ServiceCharge;
				CalcTotalCharges= CalcStayCharges + CalcMiscCharges;
				
				lblOutput.setText("The Total Cost of a hotel stay: $" + CalcTotalCharges);
			}
		});
		btnCalculate.setBounds(84, 359, 108, 38);
		frame.getContentPane().add(btnCalculate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(378, 359, 108, 38);
		frame.getContentPane().add(btnExit);
		
		//JLabel lblOutput = new JLabel("The Total Cost Of a hotel stay:");
		//lblOutput.setBounds(490, 58, 338, 63);
		//frame.getContentPane().add(lblOutput);
	}
}
