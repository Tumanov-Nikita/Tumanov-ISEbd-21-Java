package labs;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JList;


public class Labs {

	private JFrame frame;
	private AnimalPanel panel;
	private JFormattedTextField formattedTextField;
	private JList list;
	
	/**
	 * Launch the application.
	 */
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
	 */
	public Labs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 888, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new AnimalPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(21, 24, 632, 601);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton_1 = new JButton("\u0417\u0430\u043A\u0430\u0437\u0430\u0442\u044C \u0436\u0438\u0432\u043E\u0442\u043D\u043E\u0435");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdditionalForm additionalForm = new AdditionalForm(new AnimalCallBack() {
					@Override
					public void takeAnimal(IAnimals animal) {
						panel.setAnimal(animal);
						panel.repaint();
					}
				});
				
			}
		});
		btnNewButton_1.setBounds(698, 221, 155, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		ShowAnimal panel_1 = new ShowAnimal();
		panel_1.setBorder(new TitledBorder(null, "��������", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(713, 302, 140, 274);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 93, 120, 159);
		panel_1.add(panel_2);
		
		JButton btnNewButton_2 = new JButton("\u0417\u0430\u0431\u0440\u0430\u0442\u044C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setAnimal(panel.getAnimal(Integer.parseInt(formattedTextField.getText())-1));
				panel_1.repaint();
				panel.repaint();
			}
		});
		btnNewButton_2.setBounds(10, 60, 120, 23);
		panel_1.add(btnNewButton_2);
		
		JLabel label = new JLabel("\u041C\u0435\u0441\u0442\u043E:");
		label.setBounds(10, 35, 46, 14);
		panel_1.add(label);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(84, 29, 46, 20);
		panel_1.add(formattedTextField);
		String[] str = new String[5];
		for(int i = 1;i<6;i++) {
			str[i-1] = "������� " + i;
		}
		list = new JList(str);
		list.enable(false);
		list.setSelectedIndex(0);
		list.setBounds(713, 24, 140, 115);
		frame.getContentPane().add(list);
		
		JButton btnNewButton_3 = new JButton("<");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int select = list.getSelectedIndex();
				if(select>0) {
					list.setSelectedIndex(select - 1);
					panel.lvlDown();
					panel.repaint();
				}
			}
		});
		btnNewButton_3.setBounds(713, 150, 49, 37);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton button = new JButton(">");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int select = list.getSelectedIndex();
				if(select<5) {
					list.setSelectedIndex(select + 1);
					panel.lvlUp();
					panel.repaint();
				}
				
			}
		});
		button.setBounds(804, 150, 49, 37);
		frame.getContentPane().add(button);
	}
}
