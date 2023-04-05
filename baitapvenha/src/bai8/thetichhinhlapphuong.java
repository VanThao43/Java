package bai8;

import java.util.Scanner;

public class thetichhinhlapphuong {

	public static void main(String[] args) {
		float a;
		System.out.print("Nhap canh cua hinh lap phuong: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		System.out.println("The tich cua hinh lap phuong la: "+(float)Math.pow(a,3));

	}

}
