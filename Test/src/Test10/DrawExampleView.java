package Test10;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExampleView extends JFrame{
	public DrawExampleView() {
		this.setTitle("Draw Example");
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jPanelDraw jp = new jPanelDraw();
		
		this.setLayout(new BorderLayout());
		this.add(jp);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawExampleView();
	}
}
