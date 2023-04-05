package bai7;

import java.util.Scanner;

public class dientichhinhthang {

	public static void main(String[] args) {
		float daylon, daybe, chieucao;
		System.out.println("Nhap day lon, day be va chieu cao cua hinh thang: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Day lon = ");
		daylon = sc.nextFloat();
		System.out.print("Day be = ");
		daybe = sc.nextFloat();
		System.out.print("Chieu cao = ");
		chieucao = sc.nextFloat();
		System.out.println("Dien tich cua hinh thang la: "+(double)(daylon+daybe)*chieucao/2);
	}

}
