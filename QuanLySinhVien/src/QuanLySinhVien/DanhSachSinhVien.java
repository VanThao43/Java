package QuanLySinhVien;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	// 1. Hàm add => thêm sinh viên vào danh sách
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

	// 2. Xuất danh sách sv
	public void inDanhSachSinhVien() {
		// Tạo nhanh vòng for => foreach, ctrl + space
		for (SinhVien sv : danhSach) {
			System.out.println(sv);
		}
	}

	// 3. Phương thức isEmpty => kiểm tra danh sách rỗng
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}

	// 4. Phương thức size => lấy số lượng sinh viên
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}

	// 5. Phương thức removeAll => làm rỗng danh sách
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

	// 6. Phương thức contais => kiểm tra danh sách có chứa sinh viên không
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

	// 7. Phương thức remove => xóa sinh viên
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}

	// 8. Tìm sinh viên trong danh sách theo tên
	public void TimSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}

	// 9. Hàm Collections.sort => sắp xếp danh sách sinh viên
	// ***********************
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			// Comparator => khi 2 đối tượng gặp nhau thì nó sẽ dựa trên cái gì để so sánh
			// nhau
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh())
					return -1;
				else if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh())
					return 1;
				else
					return 0;
			}

		});
	}
}
