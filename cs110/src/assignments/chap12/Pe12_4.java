package assignments.chap12;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Pe12_4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Exercise 12.4");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(new MyPanel("Button 1", "Button 2", "Button 3"));
		frame.add(new MyPanel("Button 4", "Button 5", "Button 6"));
		frame.pack();
		frame.setVisible(true);
	}
}
