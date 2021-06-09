import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class OrderBrain implements ActionListener {
	
	// this is the class that has everything
	
	static JFrame f; 
	
	static JButton b, b1, b2; 
	
	static JLabel l; 
	
	static int cars = 0;
	
	static int total = 0;
	
	public OrderBrain() {
		
		// constructor
		
		f = new JFrame();
		 
	     
	     l = new JLabel(" ");
	
	    
	     b = new JButton("Order Cars");
	     b1 = new JButton("Your Cart");
	
	     
	     JPanel p = new JPanel();
	     
	     p.add(b);
	     p.add(b1);
	     p.add(l);
	
	     
	     p.setBackground(Color.WHITE);
	
	    
	     f.add(p);
	     f.setSize(500, 100);
	     f.setLocationRelativeTo(null);	     
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	     
	     f.setVisible(true);
	     
	     b.addActionListener(this);
	     b1.addActionListener(this);
		
		
	}
	
	public int cars() {
		
		// this method makes the panel where you choose the cars and the amount of cars you want.
		
		int t = 0;
		int num = 0;
		boolean b = true;
		
		while(b == true) {
			
			
			Object[] options1 = { "2015 Jeep Wrangler","2012 Lamborghini Aventador","2018 Toyota Camry" };
		
			JPanel panel = new JPanel();
			panel.add(new JLabel("What Car Will You Choose?"));
			
		
		
			int result = JOptionPane.showOptionDialog(null, panel, " ",
		    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
		    null, options1, null);
			
			if(result == 0) {
				
				num++;
				t += 30400;
				
				
			}
			
			if(result == 1) {
				
				num++;
				t+= 173207;
				
				
			}
			
			if(result == 2) {
				
				num++;
				t+= 25045;
				
				
			}
		
		
		
			int result2 = JOptionPane.showConfirmDialog(panel, "Do You Want To Choose Another Car", null, JOptionPane.YES_NO_OPTION);
		
			if(result2 == 1) {
				
				b = false;
				
				
			}
		
		}
		
			total(t);
			totalCars(num); 
			return num;
			
				
		
	}
	
	public void cart() {
		
		// this method gives you the ability to view your cart
		
		Object[] options1 = { "Back" , "Checkout" };

	    JPanel panel = new JPanel();
	    panel.add(new JLabel("Cars: " + cars ));
	    panel.add(new JLabel("Total: " + "$" + total));
	    
	
	    	int result = JOptionPane.showOptionDialog(null,panel, null, JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
	            null, options1, null);
			
			
			if(result == 0) {
		
				panel.setVisible(false);
	    	
			}
	    	
			if(result == 1) {
				
				checkout();
				
			}
		
		
	}
	
	public int totalCars(int num) {
		
		// counts total amount of cars you have in your cart
		
		cars += num;
		
		return cars;
		
		
	}
	
	public int total(int t) {
		
		// counts the total amount of money that needs to be paid
		
		total += t;
		
		return total;
	}
	
	public void checkout() {
		
		// this method lets you see the subtotal, the total before tax, and the final total, the total with tax, rounded to the nearest integer
		
		Object[] options1 = { "Done"};
		
		JPanel panel = new JPanel();
	    panel.add(new JLabel("Your Subtotal is $" + total + ".00" ));
	    panel.add(new JLabel("Sales Tax: $0.07" )); 
	    panel.add(new JLabel("Your Final Total is $" + (total + (int)(total*0.07))+".00"));
		
	    int result = JOptionPane.showOptionDialog(null,panel, null, JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE,
	            null, options1, null);
	    
	    if(result == 0) {
	    	
	    	System.exit(0);
	    	
	    	
	    }
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b) {
			
			cars();
			
			
		}
		
		if(e.getSource() == b1) {
			
			cart();
			
		}
		
	}
	

}
