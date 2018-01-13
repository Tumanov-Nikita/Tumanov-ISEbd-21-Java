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
import javax.swing.JFormattedTextField;



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
		frame.setBounds(100, 100, 864, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new AnimalPanel();
		panel.setBounds(0, 0, 635, 607);
		frame.getContentPane().add(panel);
		
		JLabel lblMaxcountfood = new JLabel("maxCountFood:");
		lblMaxcountfood.setBounds(645, 15, 105, 14);
		frame.getContentPane().add(lblMaxcountfood);
		
		JLabel lblMaxspeed = new JLabel("maxSpeed:");
		lblMaxspeed.setBounds(645, 40, 84, 14);
		frame.getContentPane().add(lblMaxspeed);
		
		JLabel lblWeight = new JLabel("weight:");
		lblWeight.setBounds(645, 65, 46, 14);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(656, 168, 46, 14);
		frame.getContentPane().add(lblColor);
		
		JLabel lblDopcolor = new JLabel("dopColor:");
		lblDopcolor.setBounds(645, 204, 84, 14);
		frame.getContentPane().add(lblDopcolor);
		
		textFieldmaxCountFood = new JTextField();
		textFieldmaxCountFood.setText("10");
		textFieldmaxCountFood.setBounds(740, 12, 86, 20);
		frame.getContentPane().add(textFieldmaxCountFood);
		textFieldmaxCountFood.setColumns(10);
		
		textFieldmaxSpeed = new JTextField();
		textFieldmaxSpeed.setText("10");
		textFieldmaxSpeed.setBounds(739, 37, 86, 20);
		frame.getContentPane().add(textFieldmaxSpeed);
		textFieldmaxSpeed.setColumns(10);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setText("10");
		textFieldWeight.setBounds(740, 62, 86, 20);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u0421\u043F\u0440\u044F\u0442\u0430\u0442\u044C\u0441\u044F");
		chckbxNewCheckBox.setBounds(656, 103, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton ColorButton = new JButton("");
		ColorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Color tmp = JColorChooser.showDialog(frame, "Выберите цвет", null);
				ColorButton.setBackground(tmp);
			}
		});
		ColorButton.setBounds(740, 159, 86, 23);
		frame.getContentPane().add(ColorButton);
		
		JButton dopColorButton = new JButton("");
		dopColorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color tmp = JColorChooser.showDialog(frame, "Выберите цвет", null);
				dopColorButton.setBackground(tmp);
			}
		});
		dopColorButton.setBounds(739, 204, 86, 23);
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
		button.setBounds(737, 252, 89, 23);
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
		button_1.setBounds(645, 252, 89, 23);
		frame.getContentPane().add(button_1);
		
		
		
		ShowAnimal panel_1 = new ShowAnimal();
		panel_1.setBounds(656, 301, 155, 236);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 99, 135, 126);
		panel_1.add(panel_2);
		
		JButton button_3 = new JButton("\u0417\u0430\u0431\u0440\u0430\u0442\u044C");
		button_3.setBounds(34, 30, 89, 23);
		panel_1.add(button_3);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(39, 64, 84, 23);
		panel_1.add(formattedTextField);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setAnimal(panel.getAnimal(Integer.parseInt(formattedTextField.getText())-1));
				panel_1.repaint();
				panel.repaint();
			}
		});		
	}
}
