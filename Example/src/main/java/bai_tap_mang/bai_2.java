package bai_tap_mang;

import java.util.Scanner;

public class bai_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số lượng phần tử: ");
		n = sc.nextInt();
		
		int a[] = new int[1000];
		System.out.print("Nhập các phần tử của mảng: ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Nhập phần tử cần chèn: ");
		int x = sc.nextInt();
		
		int y;
		System.out.print("Nhập vị trí cần chèn: ");
		y = sc.nextInt();
		
		n++;
		for (int i = n-1; i>=y; i--) {
			a[i] = a[i-1];
		}
		a[y] = x;
		
		sapXep(a, n);
		for (int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void sapXep(int a[], int n) {
		for (int i=0; i<n; i++) {
			for (int j= i+1; j<n; j++) {
				if (a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}
