package View6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TimKiemView extends JFrame {
	private TimKiemModel timKiemModel;
	private JTextArea jTextArea_vanBan;
	private JLabel jLabel_ketQua;
	private JTextField jTextField_tuKhoa;

	public TimKiemView() {
		this.timKiemModel = new TimKiemModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Tìm kiếm từ khóa");
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Arial", Font.BOLD, 30);

		ActionListener ac = new TimKiemListener(this);

		JLabel jLabel_vanBan = new JLabel("Văn Bản");
		jLabel_vanBan.setFont(font);
		jLabel_vanBan.setBackground(Color.YELLOW);
		jLabel_vanBan.setOpaque(true);
		jTextArea_vanBan = new JTextArea(100, 100);
		jTextArea_vanBan.setFont(font);
		JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		JLabel jLabel_tuKhoa = new JLabel("Từ Khóa");
		jLabel_tuKhoa.setFont(font);
		jLabel_tuKhoa.setBackground(Color.cyan);
		jLabel_tuKhoa.setOpaque(true);
		jTextField_tuKhoa = new JTextField();
		jTextField_tuKhoa.setFont(font);

		JButton jButton_thongKe = new JButton("Thống kê");
		jButton_thongKe.setFont(font);
		jButton_thongKe.addActionListener(ac);
		jButton_thongKe.setBackground(Color.GREEN);

		jLabel_ketQua = new JLabel();
		jLabel_ketQua.setFont(font);
		jLabel_ketQua.setBackground(Color.black);
		jLabel_ketQua.setForeground(Color.WHITE);
		jLabel_ketQua.setOpaque(true);

		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
		jPanel_footer.add(jLabel_tuKhoa);
		jPanel_footer.add(jTextField_tuKhoa);
		jPanel_footer.add(jButton_thongKe);
		jPanel_footer.add(jLabel_ketQua);

		this.setLayout(new BorderLayout());
		this.add(jLabel_vanBan, BorderLayout.NORTH);
		this.add(jScrollPane, BorderLayout.CENTER);
		this.add(jPanel_footer, BorderLayout.SOUTH);

	}

	public void timKiemTuKhoa() {
		this.timKiemModel.setVanBan(this.jTextArea_vanBan.getText());
		this.timKiemModel.setTuKhoa(this.jTextField_tuKhoa.getText());
		this.timKiemModel.timKiemTuKhoa();
		this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
	}
}
