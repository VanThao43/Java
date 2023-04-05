package view4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	JLabel jl_value, jl_title;

	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Counter");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Arial", Font.BOLD, 20);
		Font font1 = new Font("Arial", Font.BOLD, 30);
		Font font2 = new Font("Arial", Font.ITALIC, 30);
		
		ActionListener ac = new CounterListener(this);

		JButton jb_up = new JButton("UP");
		jb_up.setFont(font);
		jb_up.addActionListener(ac);

		JButton jb_down = new JButton("DOWN");
		jb_down.setFont(font);
		jb_down.addActionListener(ac);

		JButton jb_reset = new JButton("RESET");
		jb_reset.setFont(font);
		jb_reset.addActionListener(ac);

		jl_value = new JLabel(this.counterModel.getValue() + "", jl_value.CENTER);
		jl_value.setFont(font1);

		jl_title = new JLabel("TITLE", jl_title.CENTER);
		jl_title.setFont(font1);
		jl_title.setFont(font2);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout(20,20));
		jPanel.add(jb_up, BorderLayout.WEST);
		jPanel.add(jb_down, BorderLayout.EAST);
		jPanel.add(jb_reset, BorderLayout.SOUTH);
		jPanel.add(jl_title, BorderLayout.NORTH);
		jPanel.add(jl_value, BorderLayout.CENTER);

		this.add(jPanel, BorderLayout.CENTER);

	}
	
	public void increase() {
		this.counterModel.increase();
		this.jl_value.setText(this.counterModel.getValue()+"");
	}
	
	public void decrease() {
		this.counterModel.decrease();
		this.jl_value.setText(this.counterModel.getValue()+"");
	}
	
	public void reset() {
		this.counterModel.reset();
		this.jl_value.setText(this.counterModel.getValue()+"");
	}

}
