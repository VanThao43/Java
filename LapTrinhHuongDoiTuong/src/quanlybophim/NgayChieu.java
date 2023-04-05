package quanlybophim;

public class NgayChieu {
	private int ngay;
	private int thang;
	private int nam;
	public NgayChieu(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public int getNgay() {
		return this.ngay;
	}
	public void setNgay(int Ngay) {
		if (Ngay>=1 && Ngay<=31)
			this.ngay = Ngay;
	}

	public int getThang() {
		return this.thang;
	}

	public void setThang(int thang) {
		if (thang>=1 && thang<=31)
			this.thang = thang;
	}

	public int getNam() {
		return this.nam;
	}

	public void setNam(int nam) {
		if (nam>=1)
			this.nam = nam;
	}
	
}
