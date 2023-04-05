package java_01;

import java.util.Scanner;

public class mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[], n=0;
		a = new int [100];
		System.out.print("Nhap vao so nguyen n: ");
		Scanner sc = new Scanner(System.in);
		
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap gia tri n khong dung!!");
			System.out.println("Ket thuc chuong trinh!");
		}
		int i ;
		for (i=0; n>0; i++) {
			a[i] = n%2;
			n/=2;
		}
		System.out.print("So nhi phan cua n la: ");
		for (i=i-1; i>=0; i--) {
			System.out.print(+a[i]);
		}
	}

}
