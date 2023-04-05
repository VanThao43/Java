package bai_tap_mang;

import java.util.Scanner;

public class bai_2_2 {
	public static void nhapMaTran(int a[][], int m, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("a[%d][%d] = ", i, j);
				a[i][j] = sc.nextInt();
			}
		}
	}

	public static void xuatMaTran(int a[][], int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void tichMaTran(int a[][], int b[][], int c[][], int m, int n, int k) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < k; j++) {
				for (int l = 0; l < n; l++) {
					c[i][j] += a[i][l] * b[l][j];
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ma, na, mb, nb, a[][] = new int[100][100], b[][] = new int[100][100], c[][] = new int[200][200];
		Scanner sc = new Scanner(System.in);

		// Nhập, xuất ma trận A
		System.out.print("Nhập số hàng, số cột của ma trận A: ");
		ma = sc.nextInt();
		na = sc.nextInt();
		System.out.println("Nhập các phần tử của ma trận A: ");
		nhapMaTran(a, ma, na);
		System.out.println("\nMa trận A: ");
		xuatMaTran(a, ma, na);

		// Nhập, xuất ma trận B
		System.out.print("\nNhập số hàng, số cột của ma trận B: ");
		mb = sc.nextInt();
		nb = sc.nextInt();
		System.out.println("Nhập các phần tử của ma trận B: ");
		nhapMaTran(b, mb, nb);
		System.out.println("\nMa trận B: ");
		xuatMaTran(b, mb, nb);

		if (na != mb)
			System.out.println("Ma trận không khả tích!!");
		else {
			tichMaTran(a, b, c, ma, na, nb);
			System.out.println("\nMa trận tích của A và B là: ");
			xuatMaTran(c, ma, nb);
		}

	}

}
