package KeThuaTrongJava;

public class Test {

	public static void main(String[] args) {
		System.out.println("Kiểm tra kết quả: ");
		ConNguoi cn = new ConNguoi(null, 0);
		cn.an();
		cn.uong();
		cn.ngu();

		HocSinh hs1 = new HocSinh("Nguyễn Văn Thao", 2003, "K66K-CN2", "Đại học công nghệ - ĐHQGHN");
		System.out.println("\nThông tin sinh viên: ");
		System.out.println(hs1);
		hs1.an();
		hs1.ngu();
		hs1.lamBaiTap();
	}

}
