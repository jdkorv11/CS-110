package practice.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventExample extends JFrame {
	public EventExample() {

		setTitle("Button Example");
		JTextField tf = new JTextField(15);
		JButton b = new JButton("Press Me");
		JButton b2 = new JButton("No, Press me");
		JButton b3 = new JButton("Active Button");
		ButtonHandler bh = new ButtonHandler(tf);
		KeyTracker kt = new KeyTracker(tf);
		b.addActionListener(bh);
		b.addKeyListener(kt);
		b2.addActionListener(bh);
		b2.addKeyListener(kt);
		b3.addActionListener(bh);
		b3.addMouseListener(new MouseTracker());
		b3.addKeyListener(kt);
		tf.addActionListener(new TFHandler());
		JPanel p = new JPanel();

		p.add(b);
		p.add(b2);
		p.add(tf);
		p.add(b3);
		add(p);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		EventExample ex = new EventExample();
	}

	class ButtonHandler implements ActionListener {
		private JTextField tf;

		public ButtonHandler(JTextField tf) {
			this.tf = tf;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton b = (JButton) arg0.getSource();
			tf.setText(b.getText());
		}

	}

	class TFHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JTextField tf = (JTextField) arg0.getSource();
			String s = tf.getText();
			System.out.println(s);
		}

	}

	class MouseTracker implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			System.out.println("Entered...");
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			System.out.println("Exited...");
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
		}

	}

	class KeyTracker implements KeyListener {
		private JTextField tf;

		public KeyTracker(JTextField tf) {
			this.tf = tf;
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			char c = arg0.getKeyChar();
			tf.setText("\"" + c + "\" was pressed");
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
		}

	}
}
