package assignments.chap12;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel(String s1, String s2, String s3) {
		setLayout(new FlowLayout());

		add(new JButton(s1));
		add(new JButton(s2));
		add(new JButton(s3));
	}
}
