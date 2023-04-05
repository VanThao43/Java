package java_01;

import java.util.Scanner;

public class doisothapphansangnhiphan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Nhap vao so nguyen n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		String nhiphan = "";
		while (n != 0) {
			nhiphan = n % 2 + nhiphan;
			n /= 2;
		}
		System.out.println("So chuyen sang he nhi phan la: " + nhiphan);
	}

}
