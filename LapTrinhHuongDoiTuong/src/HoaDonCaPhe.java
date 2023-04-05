
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giatien1kg;
	private double khoiLuongCanMua;
	
	public HoaDonCaPhe(String tenLoaiString, double giatien1kg, double khoiLuongCanMua) {
		this.tenLoaiCaPhe = tenLoaiCaPhe;
		this.giatien1kg = giatien1kg;
		this.khoiLuongCanMua = khoiLuongCanMua;
	}
	
	public double tinhtongtien() {
		return this.giatien1kg * this.khoiLuongCanMua;
	}
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Hương chồn", 100, 1.5);
		System.out.println("Gia tien sau khi thanh toan la: "+hd.tinhtongtien());
	}
}
