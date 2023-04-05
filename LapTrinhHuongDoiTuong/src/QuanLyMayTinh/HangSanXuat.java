package QuanLyMayTinh;

public class HangSanXuat {
	private String TenHang;
	private QuocGia quocGia;
	
	public HangSanXuat(String tenHang, QuocGia quocGia) {
		TenHang = tenHang;
		this.quocGia = quocGia;
	}

	public String getTenHang() {
		return TenHang;
	}

	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}
	
	
}
