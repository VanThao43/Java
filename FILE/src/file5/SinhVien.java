package file5;

public class SinhVien {
	private String maSinhVien, hoVaTen;

	public SinhVien(String maSinhVien, String hoVaTen) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + "]";
	}
	
}
