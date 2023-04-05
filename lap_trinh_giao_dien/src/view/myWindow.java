package view;

import javax.swing.JFrame;

public class myWindow extends JFrame{
	public myWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void shown() {
		this.setVisible(true);
	}
	
	public void shown(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void shown(String title, int height, int width) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		myWindow m1 = new myWindow();
		m1.shown();
		
		myWindow m2 = new myWindow();
		m2.shown("dell biết đặt tên gì");
		
		myWindow m3 = new myWindow();
		m3.shown("vẫn dell biết đặt tên gì", 800, 600);
	}
}
