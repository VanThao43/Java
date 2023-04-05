package baitapvenha;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		float a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 3 so a, b, c: ");
		System.out.print("a = ");
		a = sc.nextFloat();
		System.out.print("b = ");
		b = sc.nextFloat();
		System.out.print("c = ");
		c = sc.nextFloat();
		if (a+b>c && b+c>a && c+a>b)
			System.out.println("Bo 3 so "+a+", "+b+", "+c+" tao thanh 1 tam giac");
		else
			System.out.println("Bo 3 so "+a+", "+b+", "+c+" khong tao thanh 1 tam giac!!");
	}

}
