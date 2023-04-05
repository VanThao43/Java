package lapTrinhDaoDien;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterView extends JFrame{
	private CounterModel counterModel;
	private JButton jb_up;
	private JButton jb_down;
	private JButton jb_reset;
	private JLabel jLabel_value;
	private JLabel jLabel_title;
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Counter");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener ac = new CounterListener(this);
		
		jb_up = new JButton("Up");
		jb_up.addActionListener(ac);
		
		jb_down = new JButton("Down");
		jb_down.addActionListener(ac);
		
		jb_reset = new JButton("Reset");
		jb_reset.addActionListener(ac);
		
		jLabel_title = new JLabel("Title", jLabel_title.CENTER);
		jLabel_value = new JLabel(this.counterModel.getValue()+"", jLabel_value.CENTER);
		
		JPanel jPanel = new JPanel(new BorderLayout(20,20));
		jPanel.add(jb_up, BorderLayout.WEST);
		jPanel.add(jb_down, BorderLayout.EAST);
		jPanel.add(jb_reset, BorderLayout.SOUTH);
		jPanel.add(jLabel_value, BorderLayout.CENTER, jLabel_value.CENTER);
		jPanel.add(jLabel_title, BorderLayout.NORTH);
		
		this.add(jPanel, BorderLayout.CENTER);
	}
	
	public void increase() {
		this.counterModel.increase();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	
	public void decrease() {
		this.counterModel.decrease();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
	
	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue()+"");
	}
}
