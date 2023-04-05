package quanlybophim;

public class test {

	public static void main(String[] args) {
		NgayChieu ngay1 = new NgayChieu(03, 03, 2003);
		NgayChieu ngay2 = new NgayChieu(04, 03, 2003);
		NgayChieu ngay3 = new NgayChieu(20, 03, 2003);
		
		HangSanXuat hang1 = new HangSanXuat("Hang A", "Viet Nam");
		HangSanXuat hang2 = new HangSanXuat("Hang B", "My");
		HangSanXuat hang3 = new HangSanXuat("Hang C", "Nhat Ban");
		
		BoPhim boPhim1 = new BoPhim("Bo Gia", 2020, hang1, 50000, ngay1);
		BoPhim boPhim2 = new BoPhim("End game", 2019, hang2, 100000, ngay2);
		BoPhim boPhim3 = new BoPhim("Onepiece", 2000, hang3, 30000, ngay3);
		
		System.out.println("Ten bo phim thu 2 la: "+boPhim2.inTenBoPhim());
		System.out.println("Ten bo phim thu 3 la: "+boPhim3.inTenBoPhim());
		System.out.println("Ten bo phim thu 1 la: "+boPhim1.inTenBoPhim());
		
		System.out.println("\nGia ve 1 nho hon gia ve 2: "+boPhim1.kiemTraGiaVe(boPhim2));
		System.out.println("Gia ve 1 nho hon gia ve 3: "+boPhim1.kiemTraGiaVe(boPhim3));
		
		System.out.println("\nTen hang san xuat phim thu 3: "+boPhim3.inTenSanXuatPhim());
		System.out.println("Ten hang san xuat phim thu 2: "+boPhim2.inTenSanXuatPhim());
		System.out.println("Ten hang san xuat phim thu 1: "+boPhim1.inTenSanXuatPhim());
		
		System.out.println("\nGia ve bo phim 2 sau khi giam 10%: "+boPhim2.GiaKhuyenMai(10));
		System.out.println("Gia ve bo phim 1 sau khi giam 7%: "+boPhim1.GiaKhuyenMai(7));
		System.out.println("Gia ve bo phim 3 sau khi giam 5%: "+boPhim3.GiaKhuyenMai(5));
	}

}
