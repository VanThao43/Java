package cacHamTrongChuoiString;

public class LayKiTuVaMaACII {

	public static void main(String[] args) {
		System.out.print("Nhập vào chuỗi: ");
		String sc = (new java.util.Scanner(System.in)).nextLine();
		System.out.println("-----------------------------------");

		// hàm charAt: lấy kí tự thứ vị trí thứ n trong chuỗi
		System.out.println("Vị trí thứ 5 trong chuỗi là: " + sc.charAt(5));

		/// Hàm getChar(begin, endl, mảng lưu trữ mới, vị trí muốn lưu trữ trong mảng
		/// mới): lấy ra 1 chuỗi từ chuỗi ban đầu
		System.out.println("--------------------------------------");
		char c[] = new char[25];
		sc.getChars(17, 21, c, 0);
		System.out.println(c);

		// Hàm getBytes: chuyển đổi kí tự sang mã ACII
		System.out.println("--------------------------------------");
		byte arr[] = sc.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
