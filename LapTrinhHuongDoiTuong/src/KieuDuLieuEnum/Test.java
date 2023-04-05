package KieuDuLieuEnum;

public class Test {

	public static void main(String[] args) {

		// kiểu dữ liệu Enum => giới hạn dữ liệu
		System.out.println("Kiểu dữ liệu Enum => giới hạn giữ liệu truyền vào");
		System.out.println("-------------------------");
		
		ThoiKhoaBieu tkb1 = new ThoiKhoaBieu(Day.Monday, "Toán , lý, thể dục, tin");
		ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Day.Tuesday, "Văn, anh, Sinh, thể dục, tin");
		ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Day.Wednesday, "Thể dục, toán, hóa, địa, anh");

		System.out.println(tkb1.toString());
		System.out.println("-------------------------");

		SinhVien sv1 = new SinhVien(GioiTinh.nam, "Nguyễn Văn Thao", "THPT Lý Nhân", 19);
		System.out.println(sv1.toString());

		System.out.println("-------------------------");
		// lấy số ngày trong thang bằng kiểu enum
		int x = Thang.Thang_ba.soNgay;
		System.out.println("Tháng 3 có: " + x + " ngày");

	}

}
