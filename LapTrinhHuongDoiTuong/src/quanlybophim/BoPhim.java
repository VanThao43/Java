package quanlybophim;

public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private NgayChieu ngayChieu;
	
	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, NgayChieu ngayChieu) {
		super();
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	public boolean kiemTraGiaVe(BoPhim phimKhac) {
		return phimKhac.giaVe<=this.giaVe;
	}
	
	public String inTenSanXuatPhim() {
		return this.hangSanXuat.getTenHang();
	}
	
	public double GiaKhuyenMai(double x) {
		return this.giaVe*(1-x/100);
	}
	
	public String inTenBoPhim() {
		return this.tenPhim;
	}
}
