package Bai1;

public class PhongMay {
	public static final String MAPHONG = "No MaPhong";
	public static final String TENPHONG = "No TenPhong";
	public static final long DIENTICH = 0;
	public static final QuanLy QUANLYX = new QuanLy();
	public static final May MAYY = new May();
	
	private String MaPhong, TenPhong;
	private double DienTich;
	private QuanLy QuanLyX;
	private May MayY;
	
	public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy quanLyX, May mayY) {
		this.MaPhong = maPhong;
		this.TenPhong = tenPhong;
		this.DienTich = dienTich;
		this.QuanLyX = quanLyX;
		this.MayY = mayY;
	}

	//getter
	public String getMaPhong() {
		return this.MaPhong;
	}

	public String getTenPhong() {
		return this.TenPhong;
	}
	
	public double getDienTich() {
		return this.DienTich;
	}
	
	public QuanLy getQuanLyX() {
		return this.QuanLyX;
	}
	
	public May getMayY() {
		return this.MayY;
	}
	
	
	//setter
	public PhongMay setMaPhong(String maPhong) {
		this.MaPhong = maPhong;
		return this;
	}

	public PhongMay setTenPhong(String tenPhong) {
		this.TenPhong = tenPhong;
		return this;
	}

	public PhongMay setDienTich(long dienTich) {
		this.DienTich = dienTich;
		return this;
	}

	public PhongMay setQuanLyX(QuanLy quanLyX) {
		this.QuanLyX = quanLyX;
		return this;
	}

	public PhongMay setMayY(May mayY) {
		this.MayY = mayY;
		return this;
	}

	public String toString() {
		return "MaPhong: "+this.MaPhong+"\n" + "Ten Phong: "+this.TenPhong+"\n"+
				"Dien Tich: "+this.DienTich+ "\n"+"Quan Ly: "+this.QuanLyX +
				"\n" + "May: "+this.MayY;
	}
}
