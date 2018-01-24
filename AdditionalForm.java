package labs;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class AdditionalForm {

	private JFrame frame;
	private AnimalCallBack scb;
	/**
	 * Create the application.
	 */
	public AdditionalForm(AnimalCallBack scb) {
		initialize();
		this.scb = scb;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		CreateAnimalPanel panel = new CreateAnimalPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(142, 11, 181, 250);
		frame.getContentPane().add(panel);
		
		DraggableLabel lblNewLabel = new DraggableLabel("");
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setBounds(333, 47, 46, 26);
		lblNewLabel.setOpaque(true);
		frame.getContentPane().add(lblNewLabel);
		
		DraggableLabel label = new DraggableLabel("");
		label.setBackground(Color.GREEN);
		label.setBounds(389, 47, 46, 26);
		label.setOpaque(true);
		frame.getContentPane().add(label);
		
		DraggableLabel label_1 = new DraggableLabel("");
		label_1.setOpaque(true);
		label_1.setBackground(Color.YELLOW);
		label_1.setBounds(333, 94, 46, 26);
		frame.getContentPane().add(label_1);
		
		DraggableLabel label_2 = new DraggableLabel("");
		label_2.setOpaque(true);
		label_2.setBackground(Color.ORANGE);
		label_2.setBounds(389, 94, 46, 26);
		frame.getContentPane().add(label_2);
		
		DraggableLabel label_3 = new DraggableLabel("");
		label_3.setOpaque(true);
		label_3.setBackground(Color.RED);
		label_3.setBounds(333, 146, 46, 26);
		frame.getContentPane().add(label_3);
		
		DraggableLabel label_4 = new DraggableLabel("");
		label_4.setOpaque(true);
		label_4.setBackground(Color.CYAN);
		label_4.setBounds(389, 146, 46, 26);
		frame.getContentPane().add(label_4);
		
		DraggableLabel label_5 = new DraggableLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(333, 198, 46, 26);
		frame.getContentPane().add(label_5);
		
		DraggableLabel label_6 = new DraggableLabel("");
		label_6.setOpaque(true);
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(389, 198, 46, 26);
		frame.getContentPane().add(label_6);
		
		DraggableLabel label_7 = new DraggableLabel("Rabbit");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(23, 25, 73, 48);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		label_7.setBorder(border);
		frame.getContentPane().add(label_7);
		
		DraggableLabel lblUltraship = new DraggableLabel("Sport Rabbit");
		lblUltraship.setHorizontalAlignment(SwingConstants.CENTER);
		lblUltraship.setBounds(23, 85, 73, 48);
		lblUltraship.setBorder(border);
		frame.getContentPane().add(lblUltraship);
		
		JButton btnNewButton = new JButton("\u041E\u041A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(scb != null) {
					if(panel.getAnimal()!=null) {
						scb.takeAnimal(panel.getAnimal());
					}
				}
				frame.dispose();
			}
		});
		btnNewButton.setBounds(23, 190, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u041E\u0442\u043C\u0435\u043D\u0430");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(23, 224, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox checkBox = new JCheckBox("\u0421\u043F\u0440\u044F\u0442\u0430\u0442\u044C\u0441\u044F");
		checkBox.setBounds(15, 149, 97, 23);
		frame.getContentPane().add(checkBox);
		frame.setVisible(true);
		
		
	}
}
