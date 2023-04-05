package Comparable;

public class Test {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(21020938, "Nguyen Van Thao", "12A6", 9.5);
		SinhVien sv2 = new SinhVien(21020536, "Nguyen Thi Khanh Linh", "12D1", 9.5);
		SinhVien sv3 = new SinhVien(20020302, "Nguyen Thanh Thuy", "12A5", 9.5);

		System.out.println("So sánh tên của sv1 và sv2: " + sv1.compareTo(sv2));
		System.out.println("So sánh tên của sv1 và sv3: " + sv1.compareTo(sv3));
	}

}
