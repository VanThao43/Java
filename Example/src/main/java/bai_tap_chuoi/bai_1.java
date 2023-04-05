package bai_tap_chuoi;

import java.util.Scanner;

public class bai_1 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào chuỗi: ");
		s = sc.nextLine().trim().toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			int j = i + 1;
			while (j < s.length()) {
				if (s.charAt(i) == s.charAt(j)) {
					s = s.substring(0, j) + s.substring(j + 1);
					j--;
				}
				j++;
			}
		}

		System.out.println("Số lượng các kí tự khác nhau trong chuỗi là: "+s.length());
	}
}
