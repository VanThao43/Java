package bai8;

import java.util.Scanner;

public class thetichhinhchoptamgiac {

	public static void main(String[] args) {
		float a, b, c, h;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap do dai 3 canh day: ");
			System.out.print("a = ");
			a = sc.nextFloat();
			System.out.print("b = ");
			b = sc.nextFloat();
			System.out.print("c = ");
			c = sc.nextFloat();
		} while (a + b <= c || b + c <= a || c + a <= b || a <= 0 || b <= 0 || c <= 0);
		do {
			System.out.println("Nhap chieu cao cua chop: ");
			System.out.print("h = ");
			h = sc.nextFloat();
		} while (h <= 0);

		float p = (a + b + c) / 2;
		double dientichday = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("The tich cua chop tam giac la: " + (double) 1 / 3 * dientichday * h);
	}

}
