package baitapvenha;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		float a, b;
		System.out.println("Nhap cac kich thuoc cua hinh chu nhat: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai: ");
		a = sc.nextFloat();
		System.out.print("Nhap chieu rong: ");
		b= sc.nextFloat();
		System.out.print("Chu vi cua hinh chu nhat la: "+(float)(a+b)*2);
	}

}
