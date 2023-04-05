package CacHam;

public class SinhVien implements Comparable<SinhVien> {
	private int maSinhVien;
	private String hoVaTen, tenLop;
	private double diemTrungBinh;

	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public String tenSinhVien() {
		String s = this.hoVaTen.trim();
		if (s.indexOf(" ") > 0) {
			int viTri = s.lastIndexOf(" ");
			return s.substring(viTri+1);
		} else
			return s;
	}
	
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTrungBinh="
				+ diemTrungBinh + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		String thisTen = this.tenSinhVien();
		String oTen = o.tenSinhVien();

		return thisTen.compareTo(oTen);

	}

}
