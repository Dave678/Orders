import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame implements ActionListener {
	
	// this class makes the title frame; the frame that you see first
	// it has a button that lead to the OrderBrain class
	
	private JFrame f = new JFrame();
	private JButton b = new JButton();
	private JLabel textfield = new JLabel();
	private JPanel title_panel = new JPanel();
	
	
	public Frame() {
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,200);
		f.getContentPane().setBackground(Color.white);
		f.setLayout(new BorderLayout());
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		
		textfield.setBackground(Color.black);
		textfield.setForeground(Color.white);
		textfield.setFont(new Font("Courier",Font.BOLD,25));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Welcome to Waffle Joe's Autos");
		textfield.setOpaque(true);
	
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,300,100);
		
		
		title_panel.add(textfield);
		f.add(title_panel,BorderLayout.NORTH);
		
		JPanel j = new JPanel();
		
		b = new JButton("Click Here to Start Your Order");
	
		b.setPreferredSize(new Dimension(300,70));
		
		b.setLayout(new BorderLayout());
		
		b.setBackground(Color.white);
		
		j.add(b);
		
		f.add(j);
		
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b) {
			
			OrderBrain b = new OrderBrain();
			
			
		}
		
		
	}

}
