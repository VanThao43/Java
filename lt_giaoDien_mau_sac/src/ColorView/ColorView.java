package ColorView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ColorListener.ColorListener;
import ColorModel.ColorModel;

public class ColorView extends JFrame {

	private JLabel jLabel;

	public ColorView() {

		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("My Color");
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener ac = new ColorListener(this);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));

		Font font = new Font("Arial", Font.BOLD, 30);
		Font font1 = new Font("Arial", Font.BOLD, 50);

		jLabel = new JLabel("TEXT", jLabel.CENTER);
		jLabel.setFont(font1);
		jLabel.setBackground(Color.WHITE);
		jLabel.setOpaque(true);

		JButton jButton_reset_background = new JButton("Reset Background");
		jButton_reset_background.setFont(font);
		jButton_reset_background.addActionListener(ac);

		JButton jButton_reset_text = new JButton("Reset Text");
		jButton_reset_text.addActionListener(ac);
		jButton_reset_text.setFont(font);

		JButton jButton_text_red = new JButton("Red Text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.setBackground(Color.darkGray);
		jButton_text_red.addActionListener(ac);

		JButton jButton_text_yellow = new JButton("Yellow Text");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.YELLOW);
		jButton_text_yellow.setBackground(Color.darkGray);
		jButton_text_yellow.addActionListener(ac);

		JButton jButton_text_green = new JButton("Green Text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.setBackground(Color.darkGray);
		jButton_text_green.addActionListener(ac);

		JButton jButton_background_red = new JButton("Red Background");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.RED);
		jButton_background_red.addActionListener(ac);

		JButton jButton_background_yellow = new JButton("Yellow Background");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.addActionListener(ac);

		JButton jButton_background_green = new JButton("Green Background");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.addActionListener(ac);

		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_green);

		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);

		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new GridLayout());
		jPanel1.add(jButton_reset_text);
		jPanel1.add(jButton_reset_background);

		this.add(jPanel1, BorderLayout.SOUTH);

	}

	public void changeto_red_text() {
		this.jLabel.setForeground(Color.RED);
	}

	public void changeto_yellow_text() {
		this.jLabel.setForeground(Color.YELLOW);
	}

	public void changeto_green_text() {
		this.jLabel.setForeground(Color.GREEN);
	}

	public void changeto_red_background() {
		this.jLabel.setBackground(Color.RED);
		this.jLabel.setOpaque(true);
	}

	public void changeto_yellow_background() {
		this.jLabel.setBackground(Color.YELLOW);
		this.jLabel.setOpaque(true);
	}

	public void changeto_green_background() {
		this.jLabel.setBackground(Color.GREEN);
		this.jLabel.setOpaque(true);
	}

	public void reset_background() {
		this.jLabel.setBackground(Color.WHITE);
		this.jLabel.setOpaque(true);
	}

	public void reset_text() {
		this.jLabel.setForeground(Color.BLACK);
	}
}
