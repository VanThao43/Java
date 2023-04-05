package bai_tap_chuoi;

import java.util.Scanner;

public class bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		char c[] = new char[100];
		int k = 0;
		
		System.out.print("Nhập vào chuỗi: ");
		s = sc.nextLine().trim().toLowerCase();
		
		int max = 0, b[] = new int[1000];
		
		for (int i=0; i<s.length(); i++) {
			b[s.charAt(i)]++;
			
			if (max<=b[s.charAt(i)]) {
				max = b[s.charAt(i)];
			}
		}
		for (int i=0; i<s.length(); i++) {
			int j = i+1;
			while (j<s.length()) {
				if (s.charAt(i) == s.charAt(j)) {
					s = s.substring(0,j) + s.substring(j+1);
					j--;
				}
				j++;
			}
		}
		System.out.print("Các kí tự xuất hiện nhiều nhất là: ");
		for (int i=0; i<s.length(); i++) {
			if (b[s.charAt(i)] == max) {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}

}
