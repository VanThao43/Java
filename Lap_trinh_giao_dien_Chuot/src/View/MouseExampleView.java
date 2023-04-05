package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.MouseExampleController;
import Model.MouseExampleModel;

public class MouseExampleView extends JFrame {
	private MouseExampleModel model;
	private JPanel jPanel_mouse;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_count_value;
	private JLabel jLabel_checkIn_value;

	public MouseExampleView() throws HeadlessException {
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

		jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.WHITE);
		jPanel_mouse.addMouseMotionListener(ms);
		jPanel_mouse.addMouseListener(ms);

		JPanel jPanel_info = new JPanel();
		jPanel_info.setLayout(new GridLayout(3, 3));

		JLabel jLanel_position = new JLabel("Position:");
		jLanel_position.setFont(font);
		jLabel_x = new JLabel("x = ");
		jLabel_x.setFont(font);
		jLabel_y = new JLabel("y = ");
		jLabel_y.setFont(font);
		JLabel jLabel_count = new JLabel("Number of clicks: ");
		jLabel_count.setFont(font);
		jLabel_count_value = new JLabel("0");
		jLabel_count_value.setFont(font);
		JLabel jLabel_empty1 = new JLabel();
		jLabel_empty1.setFont(font);
		JLabel jLabel_checkIn = new JLabel("Mouse is in component: ");
		jLabel_checkIn.setFont(font);
		jLabel_checkIn_value = new JLabel("No");
		jLabel_checkIn_value.setFont(font);
		JLabel jLabel_empty2 = new JLabel();
		jLabel_empty2.setFont(font);

		jPanel_info.add(jLanel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);
		jPanel_info.add(jLabel_count);
		jPanel_info.add(jLabel_count_value);
		jPanel_info.add(jLabel_empty1);
		jPanel_info.add(jLabel_checkIn);
		jPanel_info.add(jLabel_checkIn_value);
		jPanel_info.add(jLabel_empty2);

		this.setLayout(new BorderLayout());
		this.add(jPanel_mouse, BorderLayout.CENTER);
		this.add(jPanel_info, BorderLayout.SOUTH);

	}
	
	public void click() {
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
	
	public void update(int x, int y) {
		this.model.setX(x);
		this.model.setY(y);
		this.jLabel_x.setText(this.model.getX()+"");
		this.jLabel_y.setText(this.model.getY()+"");
	}
}
