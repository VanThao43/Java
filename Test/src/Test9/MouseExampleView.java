package Test9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseExampleView extends JFrame {
	private MouseExampleModel model;
	JLabel jLabel_position, jLabel_x, jLabel_y, jLabel_count, jLabel_count_value, jLabel_checkIn, jLabel_checkIn_value;

	public MouseExampleView() {
		this.model = new MouseExampleModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Mouse Example");
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Arial", Font.BOLD, 20);
		
		MouseExampleController ms = new MouseExampleController(this);

		JPanel jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.WHITE);
		jPanel_mouse.addMouseListener(ms);
		jPanel_mouse.addMouseMotionListener(ms);

		jLabel_position = new JLabel("Position: ");
		jLabel_position.setFont(font);
		jLabel_x = new JLabel("x = ");
		jLabel_x.setFont(font);
		jLabel_y = new JLabel("y = ");
		jLabel_y.setFont(font);
		jLabel_count = new JLabel("Number of clicks: ");
		jLabel_count.setFont(font);
		jLabel_count_value = new JLabel("0");
		jLabel_count_value.setFont(font);
		JLabel jLabel_empty = new JLabel();
		jLabel_checkIn = new JLabel("Mouse is in component: ");
		jLabel_checkIn.setFont(font);
		jLabel_checkIn_value = new JLabel("No");
		jLabel_checkIn_value.setFont(font);

		JPanel jPanel_info = new JPanel();
		jPanel_info.setLayout(new GridLayout(3, 3));
		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);
		jPanel_info.add(jLabel_count);
		jPanel_info.add(jLabel_count_value);
		jPanel_info.add(jLabel_empty);
		jPanel_info.add(jLabel_checkIn);
		jPanel_info.add(jLabel_checkIn_value);

		this.setLayout(new BorderLayout());
		this.add(jPanel_mouse, BorderLayout.CENTER);
		this.add(jPanel_info, BorderLayout.SOUTH);

	}
	
	public void update(int x, int y) {
		this.model.setX(x);
		this.model.setY(y);
		this.jLabel_x.setText(this.model.getX()+"");
		this.jLabel_y.setText(this.model.getY()+"");
	}
	
	public void addClick() {
		this.model.addClick();
		this.jLabel_count_value.setText(this.model.getCount()+"");
	}
	
	public void enter() {
		this.model.enter();
		this.jLabel_checkIn_value.setText(this.model.getCheckIn());
	}
	
	public void exit() {
		this.model.exit();
		this.jLabel_checkIn_value.setText(this.model.getCheckIn());
	}
}
