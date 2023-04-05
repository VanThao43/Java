package bai_tap_chuoi;

import java.util.Scanner;

public class bai_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào chuỗi: ");
		s = sc.nextLine().trim().toLowerCase();
		
		String s1[] = s.split(" ");
		String s2 = "";
		for (String x : s1) {
			s2 = s2 + (x.substring(0,1).toUpperCase()+x.substring(1)) +" ";
		}
		
		System.out.println(s2);
	}

}
