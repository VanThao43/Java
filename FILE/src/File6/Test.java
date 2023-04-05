package File6;

import java.io.File;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();

		int luaChon = 0;
		do {
			System.out.println(
					"\n\n\t\t\t---------------------------------------------MENU-----------------------------------------");
			System.out.println(
					"\t\t\t|   1.  Thêm sinh viên vào danh sách.                                                     |");
			System.out.println(
					"\t\t\t|   2.  In danh sách sinh viên ra màn hình.                                               |");
			System.out.println(
					"\t\t\t|   3.  Kiểm tra danh sách có rỗng hay không.                                             |");
			System.out.println(
					"\t\t\t|   4.  Lấy ra số lượng sinh viên trong danh sách.                                        |");
			System.out.println(
					"\t\t\t|   5.  Làm rỗng danh sách sinh viên.                                                    |");
			System.out.println(
					"\t\t\t|   6.  Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.   |");
			System.out.println(
					"\t\t\t|   7.  Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.                        |");
			System.out.println(
					"\t\t\t|   8.  Tìm kiếm tất cả các sinh viên dựa trên tên được nhập từ bàn phím.                 |");
			System.out.println(
					"\t\t\t|   9.  Xuất ra danh sách sinh viên có điểm từ cao đến thấp.                              |");
			System.out.println(
					"\t\t\t|   10. Lưu danh sách sinh viên xuống tập tin.                                            |");
			System.out.println(
					"\t\t\t|   11. Xuất danh sách sinh viên từ tập tin.                                              |");
			System.out.println(
					"\t\t\t|   0.  Thoát khỏi chương trình.                                                          |");
			System.out.println(
					"\t\t\t------------------------------------------------------------------------------------------");
			System.out.print("\nVui lòng nhập lựa chọn của bạn: ");
			try {
				luaChon = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Bạn đã thoát khỏi chương trình!");
				System.exit(0);
			}
			sc.nextLine();
			switch (luaChon) {
			case 1:
				System.out.println("Bạn đã lựa chọn chức năng: Thêm sinh viên vào danh sách.\n");
				System.out.print("Nhập mã sinh viên: ");
				String maSinhVien = sc.nextLine();
				System.out.print("Nhập họ và tên sinh viên: ");
				String hoVaTen = sc.nextLine();
				System.out.print("Nhập năm sinh: ");
				int namSinh = sc.nextInt();
				System.out.print("Nhập điểm trung bình: ");
				double diemTrungBinh = sc.nextDouble();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				break;
			case 2:
				System.out.println("Bạn đã lựa chọn chức năng: In danh sách sinh viên ra màn hình.");
				System.out.println("\nDanh sách sinh viên: ");
				dssv.inDanhSachSinhVien();
				break;
			case 3:
				System.out.println("Bạn đã lựa chọn chức năng: Kiểm tra danh sách có rỗng hay không.\n");
				if (dssv.kiemTraDanhSachRong() == true)
					System.out.println("Danh sách sinh viên rỗng!");
				else
					System.out.println("Danh sách sinh viên không rỗng.");
				break;
			case 4:
				System.out.println("Bạn đã lựa chọn chức năng: Lấy ra số lượng sinh viên trong danh sách.\n");
				System.out.println("Số lượng sinh viên là: " + dssv.laySoLuongSinhVien());
				break;
			case 5:
				System.out.println("Bạn đã lựa chọn chức năng: Làm rỗng danh sách sinh viên.\n");
				dssv.lamRongDanhSach();
				System.out.println("Đã làm rỗng danh sách!");
				break;
			case 6:
				System.out.println(
						"Bạn đã lựa chọn chức năng: Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n");
				System.out.print("Nhập mã sinh viên: ");
				String maSinhVien1 = sc.nextLine();
				SinhVien sv1 = new SinhVien(maSinhVien1);
				System.out.println("Kiểm tra sinh viên có trong danh sách: " + dssv.kiemTraTonTai(sv1));
				break;
			case 7:
				System.out.println(
						"Bạn đã lựa chọn chức năng: Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n");
				System.out.print("Nhập mã sinh viên: ");
				String maSinhVien2 = sc.nextLine();
				SinhVien sv2 = new SinhVien(maSinhVien2);
				System.out.println("Xóa sinh viên có trong danh sách: " + dssv.xoaSinhVien(sv2));
				break;
			case 8:
				System.out.println(
						"Bạn đã lựa chọn chức năng: Tìm kiếm tất cả các sinh viên dựa trên tên được nhập từ bàn phím.\n");
				System.out.println("Nhập họ và tên: ");
				String hoVaTen1 = sc.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				dssv.TimSinhVien(hoVaTen1);
				break;
			case 9:
				System.out.println("Bạn đã lựa chọn chức năng: Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n");
				dssv.sapXepSinhVienGiamDanTheoDiem();
				System.out.println("Danh sách sinh viên giảm dần theo điểm!");
				dssv.inDanhSachSinhVien();
				break;
			case 10:
				System.out.println("Nhập tên file: ");
				String tenFile = sc.nextLine();
				File f = new File(tenFile);
				dssv.ghiDuLieu(f);
				break;
			case 11: 
				System.out.println("Nhập tên file: ");
				String tenFile1 = sc.nextLine();
				File f1 = new File(tenFile1);
				dssv.docDuLieu(f1);
				break;
			case 0:
				System.out.println("Bạn đã thoát khỏi chương trình!");
				break;
			default:
				System.out.print("\n\nVui lòng nhập lại lựa chọn của bạn!");
				break;
			}
		} while (luaChon != 0);
	}

}
