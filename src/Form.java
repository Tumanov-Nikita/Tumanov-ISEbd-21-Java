import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Form {

	private JFrame frame;
	
	 private Egg[] eggs;
     private Salt salt;
     private WaterTap waterTap;
     private Knife knife;
     private Pan pan;
     private Stove stove;
     private Milk[] milk;
	
	
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
		 waterTap = new WaterTap();
         knife = new Knife();
         pan = new Pan();
         stove = new Stove();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u041A\u0443\u0445\u043D\u044F");
		frame.setBounds(100, 100, 739, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JCheckBox checkBox = new JCheckBox("\u041A\u0440\u0430\u043D");
		checkBox.setBounds(325, 63, 71, 23);
		frame.getContentPane().add(checkBox);
		
		
		 JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 20, 1));
		 spinner.setBounds(73, 64, 46, 20);
		 frame.getContentPane().add(spinner);
		
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinner_1.setBounds(73, 95, 46, 20);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinner_2.setBounds(73, 123, 46, 20);
		frame.getContentPane().add(spinner_2);
		
		JButton button = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

	            if (eggs == null)
	            {
	                eggs = new Egg[(int) spinner.getValue()];
	                for (int i = 0; i < eggs.length; i++)
	                {
	                    eggs[i] = new Egg();
	                }
	                JOptionPane.showMessageDialog(frame, "Яйца взяли");
	            }
	            else
	            {
	            	JOptionPane.showMessageDialog(frame,
	            		    "У вас уже есть яйца",
	            		    "Inane error",
	            		    JOptionPane.ERROR_MESSAGE);
	            }

	            for (int i = 0; i < eggs.length; ++i)
	            {
	                if (eggs[i].Dirty > 0)
	                {
	                    JOptionPane.showMessageDialog(frame,
		            		    "Яйца грязные!!!",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
	                    return;
	                }
	                if (eggs[i].Have_shell)
	                {
	                    JOptionPane.showMessageDialog(frame,
		            		    "Яйца со скорлупой!!!",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
	                    return;
	                }
	            }
			}
		});
		button.setBounds(143, 63, 102, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Salt salt = new Salt();
		            salt.CountSalt = (int) spinner_1.getValue();
		            if (salt.CountSalt > 0)
		            {
		                pan.AddSalt(salt);
		                JOptionPane.showMessageDialog(frame, "Соль взяли");
		            }
		            else
		            {
		                JOptionPane.showMessageDialog(frame,
		            		    "Соли же нет, что добавлять?",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
		            }
			}
		});
		button_1.setBounds(143, 94, 102, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (milk == null)
	            {
	              //  Milk t = new Milk();
	                milk = new Milk[(int) spinner_2.getValue()];



	                for (int i = 0; i < (int) spinner_2.getValue(); i++)
	                {
	                    milk[i] = new Milk();
	                }

	                JOptionPane.showMessageDialog(frame, "Молоко взяли");
	                return;
	            }
				 JOptionPane.showMessageDialog(frame,
	            		    "У вас уже есть молоко",
	            		    "Inane error",
	            		    JOptionPane.ERROR_MESSAGE);
			}
		});
		button_2.setBounds(143, 122, 102, 23);
		frame.getContentPane().add(button_2);
		
		JLabel label = new JLabel("\u042F\u0439\u0446\u0430");
		label.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0421\u043E\u043B\u044C");
		label_1.setBounds(10, 98, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u041C\u043E\u043B\u043E\u043A\u043E");
		label_2.setBounds(10, 126, 46, 14);
		frame.getContentPane().add(label_2);
		
		JButton button_3 = new JButton("\u041F\u043E\u043C\u044B\u0442\u044C");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if ((int) spinner.getValue() > 0)
		            {
					 if (checkBox.isSelected() == true){
						 waterTap.State=true; 
					 }
					 else  waterTap.State=false; 
		                if (!waterTap.State)
		                {
		                	JOptionPane.showMessageDialog(frame,
			            		    "Кран закрыт, как мыть?",
			            		    "Inane error",
			            		    JOptionPane.ERROR_MESSAGE);
		                    return;
		                }
		                eggs = new Egg[(int) spinner.getValue()];
		                pan.Init((int) spinner.getValue(), (int) spinner_1.getValue());
		                for (int i = 0; i < eggs.length; ++i)
		                {
		                    eggs[i] = new Egg();
		                }
		                for (int i = 0; i < eggs.length; ++i)
		                {
		                    eggs[i].Dirty = 0;
		                }
		                checkBox.setSelected(false);;
		                JOptionPane.showMessageDialog(frame, "Яйца помыли");
		            }
		            else
		            {
		            	JOptionPane.showMessageDialog(frame,
		            		    "Яиц нет, что мыть?",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
		            }
			}
		});
		button_3.setBounds(325, 105, 83, 38);
		frame.getContentPane().add(button_3);
		
		
		
		JButton button_4 = new JButton("\u0420\u0430\u0437\u0431\u0438\u0442\u044C \u0441\u043A\u043E\u0440\u043B\u0443\u043F\u0443");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (eggs == null)
		            {
					 JOptionPane.showMessageDialog(frame,
		            		    "Яиц нет",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            if (eggs.length == 0)
		            {
		            	JOptionPane.showMessageDialog(frame,
		            		    "Яиц нет",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            for (int i = 0; i < eggs.length; ++i)
		            {
		                if (eggs[i].Dirty > 0)
		                {
		                	JOptionPane.showMessageDialog(frame,
			            		    "Яйца грязные!!!",
			            		    "Inane error",
			            		    JOptionPane.ERROR_MESSAGE);
		                    return;
		                }
		            }
		            for (int i = 0; i < eggs.length; ++i)
		            {
		                knife.Smash(eggs[i]);
		            }
		     
		            JOptionPane.showMessageDialog(frame, "Скорлупу разбили");
			}
		});
		button_4.setBounds(492, 79, 123, 52);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u0441\u043E\u043B\u044C");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 pan.AddSalt(salt);

				 JOptionPane.showMessageDialog(frame, "Добавили соль");
			}
		});
		button_5.setBounds(42, 201, 123, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u043C\u043E\u043B\u043E\u043A\u043E");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (milk == null)
	            {
					JOptionPane.showMessageDialog(frame,
	            		    "Молока нет",
	            		    "Inane error",
	            		    JOptionPane.ERROR_MESSAGE);
	                return;
	            }
	            if (milk.length == 0)
	            {
	            	JOptionPane.showMessageDialog(frame,
	            		    "Молока нет",
	            		    "Inane error",
	            		    JOptionPane.ERROR_MESSAGE);
	                return;
	            }
	            for (int i = 0; i < milk.length; ++i)
	            {
	                pan.AddMilk(milk[i]);
	            }
	            JOptionPane.showMessageDialog(frame, "Залили молоко");
			}
		});
		button_6.setBounds(42, 235, 123, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_8 = new JButton("\u041F\u0435\u0440\u0435\u043C\u0435\u0448\u0430\u0442\u044C");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < eggs.length; ++i)
	            {
	                eggs[i].Mixed = true;               
	            }
				 JOptionPane.showMessageDialog(frame, "Перемешали");
			}
		});
		button_8.setEnabled(false);
		button_8.setBounds(42, 303, 123, 23);
		frame.getContentPane().add(button_8);
		
		
		JButton button_7 = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u044F\u0439\u0446\u0430");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (eggs == null)
	            {
					JOptionPane.showMessageDialog(frame,
	            		    "Яиц нет, что закидывать?",
	            		    "Inane error",
	            		    JOptionPane.ERROR_MESSAGE);
	                return;
	            }
	            if (eggs.length == 0)
	            {
	            	JOptionPane.showMessageDialog(frame,
	            		    "Яиц нет, что закидывать?",
	            		    "Inane error",
	            		    JOptionPane.ERROR_MESSAGE);
	                return;
	            }
	            for (int i = 0; i < eggs.length; ++i)
	            {
	                if (eggs[i].Dirty > 0)
	                {
	                	JOptionPane.showMessageDialog(frame,
		            		    "Яйца грязные, помыть бы их сначала",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
	                    return;
	                }
	            }
	            for (int i = 0; i < eggs.length; ++i)
	            {
	                if (eggs[i].Have_shell)
	                {
	                	JOptionPane.showMessageDialog(frame,
		            		    "Не разбили скорлупу",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
	                    return;
	                }
	            }
	            for (int i = 0; i < eggs.length; ++i)
	            {
	                pan.AddEggs(eggs[i]);
	            }
	            JOptionPane.showMessageDialog(frame, "Яйца добавили");
	            button_8.setEnabled(true);
			}
		});
		button_7.setBounds(42, 269, 123, 23);
		frame.getContentPane().add(button_7);
		
		
		
		JCheckBox checkBox_1 = new JCheckBox("\u041F\u043B\u0438\u0442\u0430");
		checkBox_1.setBounds(299, 216, 97, 23);
		frame.getContentPane().add(checkBox_1);
		
		JButton button_10 = new JButton("\u041F\u043E\u043B\u0443\u0447\u0438\u0442\u044C \u043E\u043C\u043B\u0435\u0442");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 eggs = pan.GetEggs();
				 JOptionPane.showMessageDialog(frame, "Приятного аппетита!");
			}
		});
		button_10.setEnabled(false);
		button_10.setBounds(500, 224, 115, 68);
		frame.getContentPane().add(button_10);
		
		JButton button_9 = new JButton("\u0413\u043E\u0442\u043E\u0432\u0438\u0442\u044C");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (checkBox_1.isSelected()) {stove.State=true;}
			else {stove.State=false;}
			
					stove.setPan(pan);
		            if (!pan.getReadyToGo()) 
		            {
		            	JOptionPane.showMessageDialog(frame,
		            		    "У нас не всё готово к варке",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            if (!stove.State)
		            {
		            	JOptionPane.showMessageDialog(frame,
		            		    "Плита не включена",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            
		            stove.Cook();
		            if (stove.getPan().IsReady())
		            {
		            	button_10.setEnabled(true); 
		                JOptionPane.showMessageDialog(frame, "Готово!");
		            }
		            else
		            {
		            	JOptionPane.showMessageDialog(frame,
		            		    "Что то пошло не так, омлет не получился",
		            		    "Inane error",
		            		    JOptionPane.ERROR_MESSAGE);
		                return;
		            }
			}
		});
		button_9.setBounds(295, 246, 101, 46);
		frame.getContentPane().add(button_9);
		
	
	}
}
