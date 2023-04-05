package java_01;

import java.util.Scanner;

public class trycatchfinally {
	public static void main(String[] args) {
		float a=0, b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 2 so a va b (b!=0): ");
		try {
			a = sc.nextFloat();
			b = sc.nextFloat();
		} catch (Exception e) {
			System.out.println("Ket thuc chuong trinh!!");
		}
		double thuong = (double)a/b;
		System.out.println("Thuong cua 2 so a va b la: "+thuong);
	}
}
