package bai7;

import java.util.Scanner;

public class tinhdientichtamgiac {

	public static void main(String[] args) {
		float a, b, c;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap vao 3 canh cua tam giac: ");
			System.out.print("a = ");
			a = sc.nextFloat();
			System.out.print("b = ");
			b = sc.nextFloat();
			System.out.print("c = ");
			c = sc.nextFloat();
		} while (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0);
		float nuachuvi = (a + b + c) / 2;
		System.out.print("Dien tich tam giac tren la: " +(double)Math.sqrt((double)nuachuvi*(nuachuvi-a)*(nuachuvi-b)*(nuachuvi-c)));
	}

}
