package Queue_And_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViDuDeQue {

	public static void main(String[] args) {
		Deque<String> danhSach = new ArrayDeque<String>();
		
		// Phương thức offer => đưa dữ liệu vào 
		danhSach.offer("Nguyễn Văn A");
		danhSach.offer("Nguyễn Thị B");
		danhSach.offer("Cao C");
		danhSach.offer("TL");
		danhSach.offerFirst("Nguyễn Văn D");
		danhSach.offerLast("Tran Duc T");

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
