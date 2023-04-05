package Queue_And_Deque;


import java.util.PriorityQueue;
import java.util.Queue;


public class ViDuProrityQueue {

	public static void main(String[] args) {
		Queue<String> danhSach = new PriorityQueue <String>();

		// Kiểu PriorityQueue => sắp xếp dữ liệu trước khi đưa ra màn hình
		// Phương thức offer => đưa dữ liệu vào 
		danhSach.offer("Nguyễn Thị B");
		danhSach.offer("Nguyễn Văn D");
		danhSach.offer("Nguyễn Văn A");
		danhSach.offer("TL");
		danhSach.offer("Cao C");

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
