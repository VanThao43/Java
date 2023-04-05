package java_01;

import java.util.Scanner;

public class tinhtongtrongjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sp = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		int a = sp.nextInt();
		System.out.println("Nhap vao so b: ");
		int b = sp.nextInt(); 
		int tong = a+b;
		System.out.println("\nTong cua 2 so a va b la: "+a+ " + " +b+ " = " +tong);
		
		int hieu = a-b;
		System.out.println("Hieu 2 so a va b la: "+a+" - " +b +" = "+hieu);
		
		int tich = a*b;
		System.out.println("Tich 2 so a va b la: "+a +" * " +b +" = " +tich);
		
		float thuong = (float)a/b;
		System.out.println("Thuong cua 2 so a va b la: " +a +" / " +b +" = " +thuong);
		
		int sodu = a%b;
		System.out.println("So du cua a/b la: "+a +" % " +b +" = "+sodu);
		
		String ketqua = (a%2==0)?"So chan":"So le";
		System.out.println("a la " +ketqua);
		
		String ketqua1 = (b%2==0)?"So chan":"So le";
		System.out.println("b la " +ketqua1);
		
		System.out.println("Gia tri tuyet doi cua a la: |a| = "+Math.abs(a));
		System.out.println("max(a,b) = "+Math.max(a,b));
		System.out.println("a^b = "+(int)Math.pow(a,b));
		System.out.println("can bac 2 cua a la: sqrt(a) = "+Math.sqrt(a));
		
	}

}
