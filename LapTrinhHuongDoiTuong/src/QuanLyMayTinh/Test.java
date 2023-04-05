package QuanLyMayTinh;

public class Test {

	public static void main(String[] args) {
		NgaySanXuat ngay1 = new NgaySanXuat(03, 03, 2003);
		NgaySanXuat ngay2 = new NgaySanXuat(04, 03, 2003);
		NgaySanXuat ngay3 = new NgaySanXuat(10, 03, 2003);
		
		QuocGia quocGia1 = new QuocGia("123abc", "Trung Quoc");
		QuocGia quocGia2 = new QuocGia("235xyz", "Viet Nam");
		QuocGia quocGia3 = new QuocGia("quinter1235", "My");
		
		HangSanXuat hang1 = new HangSanXuat("Acer", quocGia1);
		HangSanXuat hang2 = new HangSanXuat("Asus", quocGia3);
		HangSanXuat hang3 = new HangSanXuat("Dell", quocGia2);
		
		MayTinh mayTinh1 = new MayTinh(hang1, ngay2, 19000000, 12);
		MayTinh mayTinh2 = new MayTinh(hang2, ngay3, 23000000, 12);
		MayTinh mayTinh3 = new MayTinh(hang3, ngay1, 16000000, 12);
		
		System.out.println("Gia ban may tinh 1 nho hon may tinh 2: "+mayTinh1.kiemTraGiaBan(mayTinh2));
		System.out.println("Gia ban may tinh 2 nho hon may tinh 3: "+mayTinh2.kiemTraGiaBan(mayTinh3));
		
		System.out.println("\nTen quoc gia san xuat may tinh: ");
		System.out.println("May tinh 1: "+mayTinh1.inTenQuocGia());
		System.out.println("May tinh 2: "+mayTinh2.inTenQuocGia());
		System.out.println("May tinh 3: "+mayTinh3.inTenQuocGia());
		
	}

}
