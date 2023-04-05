package view5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
	private Model model;
	private JLabel jLabel_first_value, jLabel_second_value, jLabel_answer;
	private JTextField jTextField_firstValue, jTextField_secondValue, jTextField_answer;

	public View() {
		this.model = new Model();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("My Caculator");
		this.setSize(500, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Arial", Font.BOLD, 40);

		ActionListener ac = new Listener(this);

		jLabel_first_value = new JLabel("1st Value", jLabel_first_value.CENTER);
		jLabel_first_value.setFont(font);
		jLabel_first_value.setForeground(Color.RED);
		jLabel_first_value.setBackground(Color.BLACK);
		jLabel_first_value.setOpaque(true);

		jLabel_second_value = new JLabel("2st Value", jLabel_second_value.CENTER);
		jLabel_second_value.setFont(font);
		jLabel_second_value.setForeground(Color.YELLOW);
		jLabel_second_value.setBackground(Color.BLACK);
		jLabel_second_value.setOpaque(true);

		jLabel_answer = new JLabel("Answer", jLabel_answer.CENTER);
		jLabel_answer.setFont(font);
		jLabel_answer.setForeground(Color.GREEN);
		jLabel_answer.setBackground(Color.BLACK);
		jLabel_answer.setOpaque(true);

		jTextField_firstValue = new JTextField(50);
		jTextField_firstValue.setFont(font);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(font);

		JButton jButton_plus = new JButton("+");
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(ac);

		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(ac);

		JButton jButton_multiply = new JButton("x");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(ac);

		JButton jButton_divide = new JButton("/");
		jButton_divide.setFont(font);
		jButton_divide.addActionListener(ac);

		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(ac);

		JButton jButton_mod = new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(ac);

		JPanel jPanel_button = new JPanel();
		jPanel_button.setLayout(new GridLayout(2, 3));

		jPanel_button.add(jButton_plus);
		jPanel_button.add(jButton_minus);
		jPanel_button.add(jButton_multiply);
		jPanel_button.add(jButton_divide);
		jPanel_button.add(jButton_pow);
		jPanel_button.add(jButton_mod);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(3, 2, 20, 20));
		jPanel.add(jLabel_first_value);
		jPanel.add(jTextField_firstValue);
		jPanel.add(jLabel_second_value);
		jPanel.add(jTextField_secondValue);
		jPanel.add(jLabel_answer);
		jPanel.add(jTextField_answer);

		this.setLayout(new BorderLayout(10, 10));
		this.add(jPanel, BorderLayout.CENTER);
		this.add(jPanel_button, BorderLayout.SOUTH);
	}

	public void plus() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.model.setFirst_value(firstValue);
		this.model.setSecond_value(secondValue);
		this.model.plus();
		this.jTextField_answer.setText(this.model.getAnswer() + "");
	}

	public void minus() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.model.setFirst_value(firstValue);
		this.model.setSecond_value(secondValue);
		this.model.minus();
		this.jTextField_answer.setText(this.model.getAnswer() + "");
	}

	public void multiply() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.model.setFirst_value(firstValue);
		this.model.setSecond_value(secondValue);
		this.model.multiply();
		this.jTextField_answer.setText(this.model.getAnswer() + "");
	}

	public void divide() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.model.setFirst_value(firstValue);
		this.model.setSecond_value(secondValue);
		this.model.divide();
		this.jTextField_answer.setText(this.model.getAnswer() + "");
	}

	public void pow() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.model.setFirst_value(firstValue);
		this.model.setSecond_value(secondValue);
		this.model.power();
		this.jTextField_answer.setText(this.model.getAnswer() + "");
	}

	public void mod() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.model.setFirst_value(firstValue);
		this.model.setSecond_value(secondValue);
		this.model.mod();
		this.jTextField_answer.setText(this.model.getAnswer() + "");
	}
}
