package view2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import view.vidu;

public class vidu_flowLayout extends JFrame{
	public vidu_flowLayout () {
		this.setTitle("Flow Layout");
		this.setSize(800,600);
//		căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
		
//		set layout
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout flowLayout2 = new FlowLayout(FlowLayout.CENTER, 100, 100);
		this.setLayout(flowLayout);
//		this.setLayout(flowLayout1);
//		this.setLayout(flowLayout2);
		
		JButton jb_1 = new JButton("1");
		JButton jb_2 = new JButton("2");
		JButton jb_3 = new JButton("3");
		
//		thêm các thành phần vào 
		this.add(jb_1);
		this.add(jb_2);
		this.add(jb_3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	

	
	public static void main(String[] args) {
		new vidu_flowLayout();
	}
}
