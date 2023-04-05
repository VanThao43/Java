package Enum;

public class Test {

	public static void main(String[] args) {
		ThoiTiet tt1 = new ThoiTiet(Mua.Xuan, "ấm");
		ThoiTiet tt2 = new ThoiTiet(Mua.Ha, "Nóng");
		ThoiTiet tt3 = new ThoiTiet(Mua.Thu, "mát");
		ThoiTiet tt4 = new ThoiTiet(Mua.Dong, "Lanh");
		
		System.out.println(tt1);
		System.out.println(tt3.getMua().getQuy());
	}
}
