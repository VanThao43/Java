package java_01;

import java.util.Scanner;

public class PTB2 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cac he so cua phuong trinh: ");
		System.out.println("a = ");
		a = sc.nextInt();
		System.out.println("b = ");
		b = sc.nextInt();
		System.out.println("c = ");
		c = sc.nextInt();
		if (a==0) {
			if (b==0 && c==0)
				System.out.println("Phuong trinh co vo so nghiem");
			else if (b==0 && c!=0)
				System.out.println("Phuong trinh vo nghiem!!");
			else {
				float ketqua = (float)-c/b;
				System.out.println("Phuong trinh co 1 nghiem duy nhat la: x = "+ketqua);
			}
		}
		else {
			int delta = b*b-4*a*c;
			if (delta<0) 
				System.out.println("Phuong trinh vo nghiem!!!");
			else if (delta == 0) {
				float ketqua = (float)-b/(2*a);
				System.out.println("Phuong trinh co 1 nghiem duy nhat la: x = "+ketqua);
			}
			else {
				float x1 = (float)(-b-(float)Math.sqrt(delta))/(2*a);
				float x2 = (float)(-b+(float)Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem phan biet la: ");
				System.out.println("x1 = "+x1 +"\t" +"x2 = "+x2);
			}
		}
	}
}
