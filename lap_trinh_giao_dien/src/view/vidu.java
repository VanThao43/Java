package view;

import javax.swing.JFrame;

public class vidu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
//		đặt tiêu đề cho cửa sổ
		jf.setTitle("Ví dụ jframe");
		
//		đặt kích thước cho cửa sổ
		jf.setSize(800,600);

//		gắn vị trí hiển thị cho cửa sổ
		jf.setLocation(275, 60);
		
//		tự động dừng chương trình khi thoát
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//		hiện thị cửa sổ
		jf.setVisible(true);
	}

}
