package baitapvenha;

import java.util.Scanner;

public class bai5 {
	public static long tinhgiaithua(int n) {
		long  tich = 1;
		for (int i=1; i<=n; i++) {
			tich *= i;
		}
		return tich;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap vao so nguyen n>0: ");
			n = sc.nextInt();
		}while (n<0);
		System.out.println(+n+"! = "+tinhgiaithua(n));
	}

}
