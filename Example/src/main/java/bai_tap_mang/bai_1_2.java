package bai_tap_mang;

import java.util.Scanner;

public class bai_1_2 {
	public static void main(String[] args) {
		int a [][] = new int[100][100], m, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng, số cột của ma trận: ");
		m = sc.nextInt();
		n = sc.nextInt();
		
		System.out.println("Nhập các phần tử của ma trận: ");
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.printf("a[%d][%d] = ", i, j);
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Ma trận vừa nhập là: ");
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
		int max = 0;
		System.out.print("Số nguyên tố lớn nhất trong mảng 2 chiều là: ");
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (soNguyenTo(a[i][j])==1) {
					if (a[i][j]>max)
						max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}
	
	public static int soNguyenTo(int x) {
		if (x<=1)
			return 0;
		else {
			for (int i=2; i<=Math.sqrt(x); i++) {
				if (x%i==0)
					return 0;
			}
		}
		return 1;
	}
}
