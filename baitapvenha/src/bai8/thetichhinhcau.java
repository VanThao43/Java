package bai8;

import java.util.Scanner;

public class thetichhinhcau {

	public static void main(String[] args) {
		final double PI = 3.141592654102;
		float r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ban kinh cua hinh cau: ");
		r = sc.nextFloat();
		System.out.println("The tich cua hinh cau la: "+(double)PI*Math.pow(r,3)*4/3);

	}

}
