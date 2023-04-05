package QuanLyMayTinh;

public class MayTinh {
	private HangSanXuat hangSanXuat;
	private NgaySanXuat ngaySanXuat;
	private double giaban;
	private int thoiGianBaoHanh;
	
	public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaban, int thoiGianBaoHanh) {
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaban = giaban;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public NgaySanXuat getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaban() {
		return giaban;
	}

	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public boolean kiemTraGiaBan(MayTinh mayTinhKhac) {
		return this.giaban<=mayTinhKhac.giaban;
	}
	
	public String inTenQuocGia() {
		return this.hangSanXuat.getQuocGia().getTenQuocGia();
	}
}
