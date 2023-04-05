package view2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import view.vidu;

public class vidu_GridLayout extends JFrame{
	public vidu_GridLayout () {
		this.setTitle("Flow Layout");
		this.setSize(800,600);
//		căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
//		set layout
		GridLayout gl1 = new GridLayout();
		GridLayout gl2 = new GridLayout(4,4);
		GridLayout gl3 = new GridLayout(4,4,25,25);
//		this.setLayout(gl1);
//		this.setLayout(gl2);
		this.setLayout(gl3);
		
//		JButton jb_1 = new JButton("1");
//		JButton jb_2 = new JButton("2");
//		JButton jb_3 = new JButton("3");
//		
////		thêm các thành phần vào 
//		this.add(jb_1);
//		this.add(jb_2);
//		this.add(jb_3);
		
		for (int i=0; i<12; i++) {
			JButton jb = new JButton(i+"");
			this.add(jb);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	

	
	public static void main(String[] args) {
		new vidu_GridLayout();
	}
}
