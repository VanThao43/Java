package java_01;

import java.util.Scanner;

public class matranxoanoc {
	static int d = 0;
	static void hang(int a[][], int x1, int y1, int x2, int y2, int d) {
		for (int i=x1; i<=x2; i++)
			a[y1][i] = d++;
		for (int j=y1+1; j<=y2; j++)
			a[j][x2] = d++;
		if (x2-x1>0 && y2-y1>0){
			y1++; x2--;
			cot(a,x1,y1,x2,y2,d);
		}
	}
	static void cot(int a[][], int x1, int y1, int x2, int y2, int d) {
		for (int i=x2; i>=x1; i--)
			a[y2][i] = d++;
		for (int j=y2-1; j>=y1; j--)
			a[j][x1] = d++;
		if (x2-x1>0 && y2-y1>0){
			x1++; y2--;
			hang(a,x1,y1,x2,y2,d);
		}
	}

	public static void main(String[] args) {
		int a[][], m, n, d=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so hang cua ma tran: ");
		m = sc.nextInt();
		System.out.print("Nhap so hang cua ma tran: ");
		n = sc.nextInt();
		a = new int [m][n];
		cot(a,0,0,n-1,m-1,d);
		hang(a,0,0,n-1,m-1,d);
		System.out.println("\nma tran xoan oc: \n");
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println("\n");
		}
	}

}
