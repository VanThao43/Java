package bai_tap_chuoi;

import java.util.Scanner;

public class bai_5 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào chuỗi s1: ");
		s1 = sc.nextLine();
		System.out.print("Nhập vào chuỗi s2: ");
		s2 = sc.nextLine();
		
		System.out.println("Kiểm tra chuỗi s1 có giống chuỗi s2: "+s1.equals(s2));
	}
}
