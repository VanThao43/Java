package view2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

import view.vidu;

public class vidu_BorderLayout2 extends JFrame{
	public vidu_BorderLayout2 () {
		this.setTitle("Flow Layout");
		this.setSize(800,600);
//		căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
//		set layout
		BorderLayout bl1 = new BorderLayout();
		BorderLayout bl2 = new BorderLayout(20, 20);
//		this.setLayout(bl1);
		this.setLayout(bl2);
		
		JButton jb_1 = new JButton("North");
		JButton jb_2 = new JButton("West");
		JButton jb_3 = new JButton("Center");
		JButton jb_4 = new JButton("East");
		JButton jb_5 = new JButton("South");
		
//		thêm các thành phần vào 
		this.add(jb_1, BorderLayout.NORTH);
		this.add(jb_2, BorderLayout.WEST);
		this.add(jb_3, BorderLayout.CENTER);
		this.add(jb_4, BorderLayout.EAST);
		this.add(jb_5, BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	

	
	public static void main(String[] args) {
		new vidu_BorderLayout2();
	}
}
