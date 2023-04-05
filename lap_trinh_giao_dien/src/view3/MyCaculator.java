package view3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCaculator extends JFrame {
	public MyCaculator() {
		this.setTitle("My Caculator");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);

		JTextField jtf = new JTextField();
		JPanel jp_head = new JPanel();
		jp_head.setLayout(new BorderLayout());
		jp_head.add(jtf, BorderLayout.CENTER);

		JPanel jp_button = new JPanel();
		jp_button.setLayout(new GridLayout(5, 3));
		for (int i = 0; i < 10; i++) {
			JButton jb = new JButton(i + "");
			jp_button.add(jb);
		}
		JButton jb_cong = new JButton("+");
		JButton jb_tru = new JButton("-");
		JButton jb_nhan = new JButton("*");
		JButton jb_chia = new JButton("/");
		JButton jb_bang = new JButton("=");

		jp_button.add(jb_cong);
		jp_button.add(jb_tru);
		jp_button.add(jb_nhan);
		jp_button.add(jb_chia);
		jp_button.add(jb_bang);

		this.add(jp_head, BorderLayout.NORTH);
		this.add(jp_button, BorderLayout.CENTER);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		try {
//			các look and feel
//			com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel
//			javax.swing.plaf.nimbus.NimbusLookAndFeel
			
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			new MyCaculator();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
