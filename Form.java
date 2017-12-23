import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;


public class Form {

	private JFrame frame;
	private JTextField textFieldmaxCountFood;
	private JTextField textFieldmaxSpeed;
	private JTextField textFieldWeight;
	private AnimalPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
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
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 719, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new AnimalPanel();
		panel.setBounds(0, 0, 703, 292);
		frame.getContentPane().add(panel);
		
		JLabel lblMaxcountfood = new JLabel("maxCountFood:");
		lblMaxcountfood.setBounds(23, 303, 105, 14);
		frame.getContentPane().add(lblMaxcountfood);
		
		JLabel lblMaxspeed = new JLabel("maxSpeed:");
		lblMaxspeed.setBounds(23, 328, 84, 14);
		frame.getContentPane().add(lblMaxspeed);
		
		JLabel lblWeight = new JLabel("weight:");
		lblWeight.setBounds(23, 353, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(228, 313, 46, 14);
		frame.getContentPane().add(lblColor);
		
		JLabel lblDopcolor = new JLabel("dopColor:");
		lblDopcolor.setBounds(228, 353, 84, 14);
		frame.getContentPane().add(lblDopcolor);
		
		textFieldmaxCountFood = new JTextField();
		textFieldmaxCountFood.setText("10");
		textFieldmaxCountFood.setBounds(117, 300, 86, 20);
		frame.getContentPane().add(textFieldmaxCountFood);
		textFieldmaxCountFood.setColumns(10);
		
		textFieldmaxSpeed = new JTextField();
		textFieldmaxSpeed.setText("10");
		textFieldmaxSpeed.setBounds(117, 325, 86, 20);
		frame.getContentPane().add(textFieldmaxSpeed);
		textFieldmaxSpeed.setColumns(10);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setText("10");
		textFieldWeight.setBounds(117, 350, 86, 20);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u0421\u043F\u0440\u044F\u0442\u0430\u0442\u044C\u0441\u044F");
		chckbxNewCheckBox.setBounds(62, 374, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton ColorButton = new JButton("");
		ColorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Color tmp = JColorChooser.showDialog(frame, "Выберите цвет", null);
				ColorButton.setBackground(tmp);
			}
		});
		ColorButton.setBounds(284, 313, 86, 23);
		frame.getContentPane().add(ColorButton);
		
		JButton dopColorButton = new JButton("");
		dopColorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color tmp = JColorChooser.showDialog(frame, "Выберите цвет", null);
				dopColorButton.setBackground(tmp);
			}
		});
		dopColorButton.setBounds(284, 353, 86, 23);
		frame.getContentPane().add(dopColorButton);
		
		JButton button = new JButton("\u041A\u0440\u043E\u043B\u0438\u043A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IAnimals s = new Rabbit(Integer.parseInt(textFieldmaxSpeed.getText()),
						Integer.parseInt(textFieldmaxCountFood.getText()),
						Integer.parseInt(textFieldWeight.getText()),ColorButton.getBackground());
				((AnimalPanel) panel).setAnimal(s);
				panel.repaint();
			}
		});
		button.setBounds(449, 303, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0417\u0430\u044F\u0446");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IAnimals s = new SportRabbit(Integer.parseInt(textFieldmaxSpeed.getText()),
						Integer.parseInt(textFieldmaxCountFood.getText()),
						Integer.parseInt(textFieldWeight.getText()),ColorButton.getBackground(), 
						chckbxNewCheckBox.isSelected(), dopColorButton.getBackground());
				((AnimalPanel) panel).setAnimal(s);
				panel.repaint();
			}
		});
		button_1.setBounds(449, 349, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u0414\u0432\u0438\u0436\u0435\u043D\u0438\u0435");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((AnimalPanel) panel).getAnimal().moveAnimal();
				panel.repaint();
			}
		});
		button_2.setBounds(593, 324, 89, 23);
		frame.getContentPane().add(button_2);
		
		
	}
}

/*

	package labs;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Labs {

	private JFrame frame;
	private JTextField maxSpeedField;
	private JTextField maxCountPassengerField;
	private JTextField weightField;
	private ShipPanel panel;
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Labs window = new Labs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 
	public Labs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 949, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new ShipPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(21, 24, 902, 400);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Max speed:");
		lblNewLabel.setBounds(42, 455, 106, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMaxCountPassenger = new JLabel("Max count passenger:");
		lblMaxCountPassenger.setBounds(42, 480, 139, 14);
		frame.getContentPane().add(lblMaxCountPassenger);
		
		JLabel lblNewLabel_1 = new JLabel("Weight:");
		lblNewLabel_1.setBounds(260, 455, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(260, 477, 46, 14);
		frame.getContentPane().add(lblColor);
		
		JLabel lblColor_1 = new JLabel("Color:");
		lblColor_1.setBounds(372, 480, 46, 14);
		frame.getContentPane().add(lblColor_1);
		
		maxSpeedField = new JTextField();
		maxSpeedField.setText("50");
		maxSpeedField.setBounds(191, 452, 46, 20);
		frame.getContentPane().add(maxSpeedField);
		maxSpeedField.setColumns(10);
		
		maxCountPassengerField = new JTextField();
		maxCountPassengerField.setText("5");
		maxCountPassengerField.setColumns(10);
		maxCountPassengerField.setBounds(191, 477, 46, 20);
		frame.getContentPane().add(maxCountPassengerField);
		
		weightField = new JTextField();
		weightField.setText("100");
		weightField.setColumns(10);
		weightField.setBounds(316, 452, 46, 20);
		frame.getContentPane().add(weightField);
		
		JButton bodyColorSwitcher = new JButton("");
		bodyColorSwitcher.setBackground(Color.BLUE);
		bodyColorSwitcher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color tmp = JColorChooser.showDialog(frame, "Выберите цвет", null);
				bodyColorSwitcher.setBackground(tmp);
			}
		});
		bodyColorSwitcher.setBounds(316, 474, 46, 23);
		frame.getContentPane().add(bodyColorSwitcher);
		
		JButton dopColorSwitcher = new JButton("");
		dopColorSwitcher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color tmp = JColorChooser.showDialog(frame, "Выберите цвет", null);
				dopColorSwitcher.setBackground(tmp);
			}
		});
		dopColorSwitcher.setBackground(Color.BLUE);
		dopColorSwitcher.setBounds(417, 477, 46, 23);
		frame.getContentPane().add(dopColorSwitcher);
		
		JButton btnNewButton = new JButton("MotorShip");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ITransport s = new MotorShip(50,5,100,bodyColorSwitcher.getBackground());
				panel.setShip(s);
				panel.repaint();
			}
		});
		btnNewButton.setBounds(530, 451, 214, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UltaMegaBuffSuperMotorShip");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ITransport s = new UltaMegaBuffSuperMotorShip(50,5,100,bodyColorSwitcher.getBackground(),
						true,true,dopColorSwitcher.getBackground());
				panel.setShip(s);
				panel.repaint();
			}
		});
		btnNewButton_1.setBounds(530, 476, 214, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MOVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.getShip().moveCar();
				panel.repaint();
			}
		});
		btnNewButton_2.setBounds(778, 450, 106, 44);
		frame.getContentPane().add(btnNewButton_2);
	}
}


 */

