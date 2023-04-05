package Bai1;

public class May {
	private static final String MAMAY = "No MaMay";
	private static final String KIEUMAY = "No KIEUMAY";
	private static final String TINHTRANG = "No TINHTRANG";
	
	private String MaMay, KieuMay, TinhTrang;

	//constructor
	public May() {
		this(May.MAMAY, May.KIEUMAY, May.TINHTRANG);
	}
	
	public May(String maMay, String kieuMay, String tinhTrang) {
		this.MaMay = maMay;
		this.KieuMay = kieuMay;
		this.TinhTrang = tinhTrang;
	}

	
	//getter
	public String getMaMay() {
		return this.MaMay;
	}

	public String getKieuMay() {
		return KieuMay;
	}
	
	public String getTingTrang() {
		return this.TinhTrang;
	}
	
	
	//setter
	
	public May setMaMay(String maMay) {
		this.MaMay = maMay;
		return this;
	}
	
	public May setKieuMay(String kieuMay) {
		this.KieuMay = kieuMay;
		return this;
	}

	public May setTinhTrang(String tinhTrang) {
		this.TinhTrang = tinhTrang;
		return this;
	}
	
	public String toString() {
		return this.MaMay +", "+this.KieuMay+", "+this.TinhTrang;
	}
}
