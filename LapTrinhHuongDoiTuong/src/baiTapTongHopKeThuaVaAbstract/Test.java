package baiTapTongHopKeThuaVaAbstract;

public class Test {

	public static void main(String[] args) {
		HangSanXuat h1 = new HangSanXuat("Hãng 1", "Việt Nam");
		HangSanXuat h2 = new HangSanXuat("Hãng 2", "USA");
		HangSanXuat h3 = new HangSanXuat("Hãng 3", "Trung Quốc");

		PhuongTienDiChuyen p1 = new XeOto(h1, "Xăng");
		MayBay p2 = new MayBay(h2, "Xăng");
		PhuongTienDiChuyen p3 = new XeDap(h3);
		
		System.out.println("Hãng sản xuất ô tô: "+p1.layTenHangSanXuat());
		System.out.println("Nhiên liêu máy bay: "+p2.getLoaiNhienLieu());
		
		System.out.println("------------------");
		System.out.println("Vận tốc: ");
		System.out.println("Xe đạp: "+p3.layVanToc());
		System.out.println("Ô tô: "+p1.layVanToc());
		System.out.println("Máy bay: "+p2.layVanToc());
		
		System.out.println("---------------------");
		p2.batDau();
		
		System.out.println("---------------------");
		p1.tangToc();
		
		System.out.println("---------------------");
		System.out.print("Máy bay: ");
		p2.catCanh();
		p2.haCanh();
		
		System.out.println("---------------------");
		System.out.println("Tên quốc gia sản xuất: ");
		System.out.println("Ô tô: "+p1.layTenQuocGia());
		System.out.println("Máy bay: "+p2.layTenQuocGia());
		System.out.println("Xe đạp: "+p3.layTenQuocGia());
	}

}
