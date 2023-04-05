package CacHam;

import java.util.Arrays;

public class copyMang {
	public static void main(String[] args) {
		int a[] = new int[] { 4, 3, 2003 };
		int b[] = a;
		b[0] = 3;
		System.out.println("Mảng b được copy từ mảng a là: " + Arrays.toString(b));

		// Hàm Arrays.toString => in ra cả mảng
		System.out.println("\nHàm Arrays.toString => in ra cả mảng như trên");
		System.out.println("---------------------------");

		// Hàm clone(), hàm System.arraycopy => copy mảng
		System.out.println("Hàm clone()");
		int c[] = a.clone();
		System.out.println("mảng c sau khi copy từ mảng a: " + Arrays.toString(c));
		System.out.println("---------------------------");
		System.out.println("Hàm System.arraycopy");
		int d[] = new int[b.length];
		System.arraycopy(b, 0, d, 0, a.length);
		System.out.println("Mảng d sau khi copy từ mảng b: " + Arrays.toString(d));

		
	}
}
