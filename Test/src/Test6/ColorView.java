package Test6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorView extends JFrame {
	private JLabel jLabel;

	public ColorView() {
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Color");
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Arial", Font.BOLD, 30);
		Font font1 = new Font("Arial", Font.BOLD, 50);
		
		ActionListener ac = new ColorListener(this);

		jLabel = new JLabel("TEXT", jLabel.CENTER);
		jLabel.setFont(font1);
		jLabel.setForeground(Color.black);
		jLabel.setBackground(Color.WHITE);
		jLabel.setOpaque(true);

		JButton jButton_text_red = new JButton("Red Text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.red);
		jButton_text_red.setBackground(Color.DARK_GRAY);
		jButton_text_red.addActionListener(ac);

		JButton jButton_text_green = new JButton("Green Text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.setBackground(Color.DARK_GRAY);
		jButton_text_green.addActionListener(ac);

		JButton jButton_text_blue = new JButton("Blue Text");
		jButton_text_blue.setFont(font);
		jButton_text_blue.setForeground(Color.BLUE);
		jButton_text_blue.setBackground(Color.DARK_GRAY);
		jButton_text_blue.addActionListener(ac);

		JButton jButton_background_yellow = new JButton("Yellow BackGround");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.setOpaque(true);
		jButton_background_yellow.addActionListener(ac);

		JButton jButton_background_orange = new JButton("Orange BackGround");
		jButton_background_orange.setFont(font);
		jButton_background_orange.setBackground(Color.ORANGE);
		jButton_background_orange.setOpaque(true);
		jButton_background_orange.addActionListener(ac);

		JButton jButton_background_green = new JButton("Green BackGround");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.setOpaque(true);
		jButton_background_green.addActionListener(ac);

		JButton jButton_reset_text = new JButton("Reset Text");
		jButton_reset_text.setFont(font);
		jButton_reset_text.addActionListener(ac);

		JButton jButton_reset_background = new JButton("Reset BackGround");
		jButton_reset_background.setFont(font);
		jButton_reset_background.addActionListener(ac);

		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));
		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_text_blue);
		jPanel.add(jButton_background_yellow);
		jPanel.add(jButton_background_orange);
		jPanel.add(jButton_background_green);

		this.add(jPanel, BorderLayout.CENTER);

		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(1, 2));
		jPanel_footer.add(jButton_reset_text);
		jPanel_footer.add(jButton_reset_background);

		this.add(jPanel_footer, BorderLayout.SOUTH);
	}
	
	public void changeTo_red_text() {
		this.jLabel.setForeground(Color.RED);
	}

	public void changeTo_green_text() {
		this.jLabel.setForeground(Color.green);
	}
	
	public void changeTo_blue_text() {
		this.jLabel.setForeground(Color.BLUE);
	}
	
	public void changeTo_yellow_background() {
		this.jLabel.setBackground(Color.YELLOW);
		this.jLabel.setOpaque(true);
	}
	
	public void changeTo_orange_background() {
		this.jLabel.setBackground(Color.ORANGE);
		this.jLabel.setOpaque(true);
	}
	
	public void changeTo_green_background() {
		this.jLabel.setBackground(Color.GREEN);
		this.jLabel.setOpaque(true);
	}
	
	public void reset_text() {
		this.jLabel.setForeground(Color.BLACK);
	}
	
	public void reset_background() {
		this.jLabel.setBackground(Color.WHITE);
		this.jLabel.setOpaque(true);
	}
}
