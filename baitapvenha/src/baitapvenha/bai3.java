package baitapvenha;

import java.util.Scanner;

public class bai3 {
	int kiem_tra_SNT(int n) {
		if (n<=1)
			return 0;
		else {
			for (int i=2; i<=Math.sqrt(n); i++) {
				if (n%i==0)
					return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap vao so nguyen n>0: n = ");
			n = sc.nextInt();
		} while (n<0);
		
		bai3 m = new bai3();
		if (m.kiem_tra_SNT(n)==1)
			System.out.println(+n+" la so nguyen to :))");
		else
			System.out.println(+n+" khong la so nguyen to!!");

	}

}
