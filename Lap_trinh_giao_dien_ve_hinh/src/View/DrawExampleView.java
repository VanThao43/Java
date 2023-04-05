package View;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class DrawExampleView extends JFrame {
	public DrawExampleView() {
		this.setTitle("Draw Example");
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JpanelDraw jpanelDraw = new JpanelDraw();

		this.setLayout(new BorderLayout());
		this.add(jpanelDraw, BorderLayout.CENTER);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new DrawExampleView();
	}
}
