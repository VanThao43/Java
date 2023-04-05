package KieuDuLieuEnum;

public class SinhVien {

	private GioiTinh gt;
	private String hoVaTen;
	private String tenTruong;
	private int tuoi;

	public SinhVien(GioiTinh gt, String hoVaTen, String tenTruong, int tuoi) {
		this.gt = gt;
		this.hoVaTen = hoVaTen;
		this.tenTruong = tenTruong;
		this.tuoi = tuoi;
	}

	public GioiTinh getGt() {
		return gt;
	}

	public void setGt(GioiTinh gt) {
		this.gt = gt;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	@Override
	public String toString() {
		return "SinhVien [gt=" + gt + ", hoVaTen=" + hoVaTen + ", tenTruong=" + tenTruong + ", tuoi=" + tuoi + "]";
	}

}
