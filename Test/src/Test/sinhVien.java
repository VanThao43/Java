package Test;

import java.io.Serializable;

public class sinhVien implements Serializable{
	private int maSinhVien;
	private String hoVaTen, gioiTinh, tenTruong, tenLop;
	private double diemTrungBinh;

	public sinhVien(int maSinhVien, String hoVaTen, String gioiTinh, String tenTruong, String tenLop,
			double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.gioiTinh = gioiTinh;
		this.tenTruong = tenTruong;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "sinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", gioiTinh=" + gioiTinh + ", tenTruong="
				+ tenTruong + ", tenLop=" + tenLop + ", diemTrungBinh=" + diemTrungBinh + "]";
	}
	
	
}
