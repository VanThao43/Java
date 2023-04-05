package bai8;

import java.util.Scanner;

public class thetichhinhtru {

	public static void main(String[] args) {
		final double PI = 3.141592654102;
		float r, h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cac kich thuoc cua hinh tru:");
		System.out.print("Nhap ban kinh day: ");
		r = sc.nextFloat();
		System.out.print("Nhap chieu cao: ");
		h = sc.nextFloat();
		System.out.println("The tich cua hinh tru la: "+(double)PI*r*r*h);
	}

}
