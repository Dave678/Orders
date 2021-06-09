import java.awt.Component;
import javax.swing.JOptionPane;
public class JOP {
	
	// this class makes it easier to write out JOptionPane by simplifying it to JOP
	// didn't even use this but whatever
	
	
	public JOP() {
    }

    public static void msg(String msg) {
        JOptionPane.showMessageDialog((Component)null, msg);
    }

    public static String in(String msg) {
        return JOptionPane.showInputDialog(msg);
    }
}
