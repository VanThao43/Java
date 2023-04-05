package map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien_map {
	// TreeMap => sắp xếp dữ liệu
	// HashMap => không sắp xếp dữ liệu
	// tương tự với TreeSet và hashSet
	// Map<key, value>...........
	Map<String, String> duLieu = new TreeMap<String, String>();

	// Hàm put => thêm dữ liệu vào map
	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}

	// Hàm remove => xóa dữ liệu trong map
	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}

	// Hàm get(tuKhoa) => trả về yNghia của tử khóa (lấy trước trả về sau)
	public String traTu(String tuKhoa) {
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}
 
	// keySet => lấy ra các từ khóa
	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}

	public int laySoLuong() { 
		return this.duLieu.size();
	}

	public void xoaTatCaTuKhoa() {
		this.duLieu.clear();
	}

	public static void main(String[] args) {
		TuDien_map td = new TuDien_map();
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-----------------------------------");
			System.out.println("MENU: Tra từ điển Anh-Việt.");
			System.out.println("1. Thêm từ (Từ khóa, Ý nghĩa).");
			System.out.println("2. Xóa từ.");
			System.out.println("3. Tìm ý nghĩa của từ khóa.");
			System.out.println("4. In ra danh sách các từ khóa.");
			System.out.println("5. In ra số lượng từ khóa.");
			System.out.println("6. Xóa tất cả các từ khóa.");
			System.out.println("0. Thoát khỏi chương trình.");

			System.out.print("\nNhập lựa chọn của bạn: ");
			luaChon = sc.nextInt();
			sc.nextLine();

			switch (luaChon) {
				case 1:
					System.out.println("Bạn đã chọn mục thêm từ.");
					System.out.print("Nhập từ khóa: ");
					String tuKhoa = sc.nextLine();
					System.out.print("Nhập ý nghĩa: ");
					String yNghia = sc.nextLine();
					td.themTu(tuKhoa, yNghia);
					break;
				case 2: 
					System.out.println("Bạn đã chọn mục xóa từ.");
					System.out.print("Nhập từ cần xóa: ");
					String tuKhoa1 = sc.nextLine();
					tuKhoa1.trim();
					td.xoaTu(tuKhoa1);
					break;
				case 3: 
					System.out.println("Bạn đã chọn mục tìm ý nghĩa của từ khóa.");
					System.out.print("Nhập từ khóa: ");
					String tuKhoa3 = sc.nextLine();
					System.out.println("ý nghĩa của "+tuKhoa3+" là: "+td.traTu(tuKhoa3));
					break;
				case 4: 
					System.out.println("Bạn đã chọn mục in ra danh sách các từ khóa.");
					td.inTuKhoa();
					break;
				case 5: 
					System.out.println("Bạn đã chọn mục in ra số lượng các từ khóa.");
					System.out.println("Số lượng các từ khóa là: "+td.laySoLuong());
					break;
				case 6:
					System.out.println("Bạn đã chọn mục xóa tất cả các từ khóa.");
					td.xoaTatCaTuKhoa();
					break;
				case 0:
					System.out.println("Bạn đã thoát khỏi chương trình!");
					break;
			}
		} while (luaChon != 0);
	}
}
