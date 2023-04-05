package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.LastButtonListener;
import Model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private JButton jButton_1, jButton_2, jButton_3, jButton_4, jButton_reset;
	private JLabel jLabel;

	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Last Button");
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener ac = new LastButtonListener(this);

//		tạo ra font chữ
		Font font = new Font("Arial", Font.BOLD, 30);
		jButton_1 = new JButton("1");
		// gán font chữ
		jButton_1.setFont(font);
		jButton_1.addActionListener(ac);

		jButton_2 = new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(ac);

		jButton_3 = new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(ac);

		jButton_4 = new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(ac);

		jButton_reset = new JButton("RESET");
		jButton_reset.setFont(font);
		jButton_reset.addActionListener(ac);

		JPanel jPanel_center = new JPanel();
		jPanel_center.setLayout(new GridLayout(2, 2));
		jPanel_center.add(jButton_1);
		jPanel_center.add(jButton_2);
		jPanel_center.add(jButton_3);
		jPanel_center.add(jButton_4);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new GridLayout());
		jPanel1.add(jButton_reset);

		JPanel jPanel_footer = new JPanel();
		jLabel = new JLabel("---------------");
		jLabel.setFont(font);
		jPanel_footer.add(jLabel, jLabel.CENTER);

		this.setLayout(new BorderLayout());
		this.add(jPanel_center, BorderLayout.CENTER);
		this.add(jPanel_footer, BorderLayout.SOUTH);
		this.add(jPanel1, BorderLayout.NORTH);
	}

	public void inRa_1() {
		this.lastButtonModel.setValue_1();
		this.jLabel.setText("Last Button: " + this.lastButtonModel.getValue() + "");
	}

	public void inRa_2() {
		this.lastButtonModel.setValue_2();
		this.jLabel.setText("Last Button: " + this.lastButtonModel.getValue() + "");
	}

	public void inRa_3() {
		this.lastButtonModel.setValue_3();
		this.jLabel.setText("Last Button: " + this.lastButtonModel.getValue() + "");
	}

	public void inRa_4() {
		this.lastButtonModel.setValue_4();
		this.jLabel.setText("Last Button: " + this.lastButtonModel.getValue() + "");
	}
	
	public void reset() {
		this.jLabel.setText("---------------");
	}
}
