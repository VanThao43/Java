package View6;

public class TimKiemModel {
	private String vanBan, tuKhoa, ketQua;
	
	public TimKiemModel() {
		this.vanBan = "";
		this.tuKhoa = "";
		this.ketQua = "";
	}

	public String getVanBan() {
		return vanBan;
	}

	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

	public String getKetQua() {
		return ketQua;
	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}
	
	public void timKiemTuKhoa() {
		int dem = 0, viTri = 0;
		while (true) {
			int i = this.vanBan.indexOf(this.tuKhoa,viTri);
			if (i>=0) {
				dem++;
				viTri = i+1;
			} else 
				break;
		}
		this.ketQua = "Kết quả: có "+dem+" từ \""+this.tuKhoa+"\"";
		System.out.println(this.ketQua);
	}
}
