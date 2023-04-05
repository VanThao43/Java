package bai7;

import java.util.Scanner;

public class tinhdientichhinhtron {

	public static void main(String[] args) {
		final double PI = 3.141592654102;
		float r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ban kinh cua hinh tron: r = ");
		r = sc.nextFloat();
		System.out.print("Dien tich cua hinh tron la: "+(double)r*r*PI);
	}

}
