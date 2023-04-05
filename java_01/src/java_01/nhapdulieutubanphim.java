package java_01;

import java.util.Scanner;

public class nhapdulieutubanphim {

	public static void main(String[] args) {
		Scanner sp = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten: ");
		String hovaten = sp.nextLine();
		System.out.println("\nNhap ma sinh vien: ");
		long masinhvien = sp.nextLong();
		System.out.println("\nNhap diem thi cua sinh vien: ");
		float diemthi = sp.nextFloat();
		System.out.println("\nHo va ten: "+hovaten);
		System.out.println("Ma sinh vien: "+masinhvien);
		System.out.println("Diem cua sinh vien: "+diemthi);
	}

}
