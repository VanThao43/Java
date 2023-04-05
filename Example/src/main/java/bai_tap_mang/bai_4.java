package bai_tap_mang;

import java.util.Scanner;

public interface bai_4 {
	public static void main(String[] args) {
		int n , a[] = new int[1000] , k = 0, c[] = new int[1000];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập số lượng phần tử của mảng: ");
		n = sc.nextInt();
		
		System.out.print("Nhập các phần tử của mảng: ");
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (soNguyenTo(a[i])==1) {
				c[k] = a[i];
				k++;
			}
		}
		sapXep(c, k);
		for (int i=0; i<n; i++) {
			if (soNguyenTo(a[i])==0) {
				c[k] = a[i];
				k++;
			}
		}
		
		System.out.print("Mảng sau khi đã đưa các số nguyên tố lên đầu và sắp xếp các số đó là: ");
		for (int i=0; i<n; i++) {
			System.out.print(c[i]+" ");
		}
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
