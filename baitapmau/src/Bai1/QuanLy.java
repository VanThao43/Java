package Bai1;

public class QuanLy {
	public static final String MAQUANLY = "No MaQuanLy";
	public static final String HOTEN = "No HoTen";
	
	private String MaQuanLy, HoTen;

	public QuanLy() {
		this(QuanLy.MAQUANLY, QuanLy.HOTEN);
	}
	
	public QuanLy(String maQuanLy, String hoTen) {
		this.MaQuanLy = maQuanLy;
		this.HoTen = hoTen;
	}

	//getter
	public String getMaQuanLy() {
		return this.MaQuanLy;
	}

	public String getHoTen() {
		return this.HoTen;
	}
	
	public QuanLy setMaQuanLy(String maQuanLy) {
		this.MaQuanLy = maQuanLy;
		return this;
	}
	
	public QuanLy setHoTen(String hoTen) {
		this.HoTen = hoTen;
		return this;
	}
	
	public String toString() {
		return this.MaQuanLy+", "+this.HoTen;
	}
}
