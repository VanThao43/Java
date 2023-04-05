package Abstract;

public class Test {

	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 10);
		ToaDo td2 = new ToaDo(04, 03);
		ToaDo td3 = new ToaDo(03, 03);

		Hinh h1 = new Diem(td1);
		Hinh h2 = new HinhTron(td2, 3);
		Hinh h3 = new HinhChuNhat(td3, 3, 3);
		
		System.out.println("Dien tich hinh tron: "+h2.tinhDienTich());
		System.out.println("Dien tich hinh chu nhat: "+h3.tinhDienTich());
		System.out.println("Dien tich 1 diem: "+h1.tinhDienTich());
	}

}
