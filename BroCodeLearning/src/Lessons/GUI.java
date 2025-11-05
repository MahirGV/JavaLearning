package Lessons;

import javax.swing.JOptionPane;

public class GUI {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Your name");
		JOptionPane.showMessageDialog(null, "Hi," + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Your age?"));
		JOptionPane.showMessageDialog(null, "Your age is" + age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Height"));
		JOptionPane.showMessageDialog(null, height);
	}
}
