package assignments.chap12;

import java.awt.FlowLayout;

import javax.swing.*;

public class Pe12_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Exercise 12.1");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());

		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));
		p2.add(new JButton("Button 4"));
		p2.add(new JButton("Button 5"));
		p2.add(new JButton("Button 6"));

		frame.setLayout(new FlowLayout());
		frame.add(p1);
		frame.add(p2);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
