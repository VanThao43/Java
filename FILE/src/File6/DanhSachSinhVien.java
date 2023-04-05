package File6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
	
	// 10. Ghi xuống file
	public void ghiDuLieu(File file) {
		try {
//			OutputStream => giúp ghi xuống file
			
			OutputStream os = new FileOutputStream(file);
			
//			ObjectOutputStream => giúp ghi được 1 đối tượng xuống file
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			for (SinhVien sinhVien : danhSach) {
				oos.writeObject(sinhVien);
			}
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 11. đọc dữ liệu từ file
	public void docDuLieu(File file) {
		try {
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			SinhVien sv = null;
			while (true) {
				sv = (SinhVien) ois.readObject();
				if (sv == null)
					break;
				this.danhSach.add(sv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
