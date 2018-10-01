package view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {
	
	public int i;
	
	public Gui() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//frame.setLayout(new GridLayout(2,1));
		frame.setSize(600,500);
				
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		frame.setLayout(gbl);
		
		
		JTextField txf = new JTextField(); 
		
		JButton [] buttons = new JButton[100];
		
		buttons[0] = new JButton("1");
		buttons[1] = new JButton("2");
		buttons[2] = new JButton("3");
		buttons[3] = new JButton("Clear");
		buttons[4] = new JButton("4");
		buttons[5] = new JButton("5");
		buttons[6] = new JButton("6");
		buttons[7] = new JButton("+");
		buttons[8] = new JButton("7");
		buttons[9] = new JButton("8");
		buttons[10] = new JButton("9");
		buttons[11] = new JButton("-");
		buttons[12] = new JButton("0");
		buttons[13] = new JButton("*");
		buttons[14] = new JButton("/");
		buttons[15] = new JButton("=");
			
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,1));
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 2;

		panel1.add(txf);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 4;
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4,3));
		
		for(i=0;i<=15;i++){
			panel2.add(buttons[i]);
		}
		
				
		frame.add(panel1);
		frame.add(panel2);
		frame.pack();
		frame.setVisible(true);	
	}
}
