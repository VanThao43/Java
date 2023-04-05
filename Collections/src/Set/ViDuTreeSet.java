
////            	RÚT THĂM TRÚNG THƯỞNG

package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ViDuTreeSet {
	// TreeSet => thêm vào các giá trị không trùng nhau giống HashSet nhưng in ra có
	// sắp xếp theo thứ tự
	Set<String> ThungPhieu = new TreeSet<String>();

	public ViDuTreeSet() {
	}

	public boolean themMaDuThuong(String giaTri) {
		return this.ThungPhieu.add(giaTri);
	}

	public boolean xoaPhieuDuThuong(String giaTri) {
		return this.ThungPhieu.remove(giaTri);
	}

	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.ThungPhieu.contains(giaTri);
	}

	public void xoaTatCaPhieu() {
		this.ThungPhieu.clear();
	}

	public int laySoLuongPhieu() {
		return this.ThungPhieu.size();
	}

	public String rutPhieu() {
		Random rd = new Random();
		int viTri = rd.nextInt(this.ThungPhieu.size());
		return (String) this.ThungPhieu.toArray()[viTri];
	}

	public void inPhieuTrungThuong() {
		System.out.println(Arrays.toString(this.ThungPhieu.toArray()));
	}

	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		ViDuTreeSet a = new ViDuTreeSet();
		do {
			System.out.println("------------------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã dự thưởng.");
			System.out.println("2. Xóa mã dự thưởng.");
			System.out.println("3. Kiểm tra mã dự thưởng có tồn tại hay không.");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In tất cả các phiếu trúng thưởng.");
			System.out.println("0. Thoát khỏi chương trình.");

			System.out.print("\nNhập lựa chọn của bạn: ");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.print("Nhập mã dự thưởng: ");
				String maDuThuong = sc.nextLine();
				if (luaChon == 1) {
					a.themMaDuThuong(maDuThuong);
				} else if (luaChon == 2) {
					a.xoaPhieuDuThuong(maDuThuong);
					System.out.println("Các mã dự thưởng còn lại: ");
					a.inPhieuTrungThuong();
				} else {
					System.out.println("kết quả kiếm tra phiếu tồn tại: " + a.kiemTraPhieuTonTai(maDuThuong));
				}
			} else if (luaChon == 4) {
				a.xoaTatCaPhieu();
			} else if (luaChon == 5) {
				System.out.println("Số lượng phiếu dự thưởng: " + a.laySoLuongPhieu());
			} else if (luaChon == 6) {
				System.out.println("Mã số trúng thưởng: " + a.rutPhieu());
			} else if (luaChon == 7) {
				System.out.println("Các mã phiếu dự thưởng là: ");
				a.inPhieuTrungThuong();
			} else if (luaChon == 0) {
				System.out.println("Bạn đã thoát khỏi chương trình!");
			}
		} while (luaChon != 0);
	}

}
