package bai_tap_chuoi;

import java.util.Scanner;

public class bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s, s1 = "Hello World";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập vào chuỗi: ");
		s = sc.nextLine();
		
		int count = 0, vitri = 0;
		while (true) {
			int i = s.indexOf(s1, vitri); // lastIndexOf
			if (i>=0) {
				count++;
				vitri = i+1;
			}
			else 
				break;
		}
		
		System.out.println("Số lượng các từ \"Hello World\" trong chuỗi là: "+count);
	}

}
