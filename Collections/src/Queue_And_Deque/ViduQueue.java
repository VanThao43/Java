package Queue_And_Deque;

import java.util.Queue;
import java.util.LinkedList;

public class ViduQueue {

	public static void main(String[] args) {
		// LinkedList => hiện thực hóa lớp <Interface>Queue
		Queue<String> danhSach = new LinkedList<String>();

		// Phương thức offer => đưa dữ liệu vào LinkedList
		danhSach.offer("Nguyễn Văn A");
		danhSach.offer("Nguyễn Thị B");
		danhSach.offer("Cao C");
		danhSach.offer("TL");

		// Phương thức poll => đưa giữ liệu ra và xóa luôn Queue
		// peek => đưa dữ liệu ra nhưng không xóa

		while (true) {
			String name = danhSach.poll();
			if (name == null) {
				break;
			}
			System.out.println(name);
		}

	}

}
