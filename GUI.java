
import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age?"));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");

		double height = Double.parseDouble(JOptionPane.showInputDialog("what is your height?"));
		JOptionPane.showMessageDialog(null, "You are " + height + " ft tall");
		
		// TODO Auto-generated method stub

	}


}
