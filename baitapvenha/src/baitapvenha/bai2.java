package baitapvenha;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		int a1, b1, c1, a2, b2, c2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao cac he so cua he phuong trinh: ");
		a1 = sc.nextInt();b1 = sc.nextInt();c1 = sc.nextInt();
		a2 = sc.nextInt();b2 = sc.nextInt();c2 = sc.nextInt();
		float D = a1*b2 - a2*b1, Dx = c1*b2 - c2*b1, Dy = a1*c2 - a2*c1;
		if (D==0) {
			if (Dx==0 && Dy==0) 
				System.out.println("He phuong trinh co vo so nghiem");
			else 
				System.out.println("He phuong trinh vo nghiem!!");
		}
		else {
			float x = Dx/D, y = Dy/D;
			System.out.print("He phuong trinh co nghiem : " +"(x,y) = ("+x+","+y +")");
			
		}

	}

}
