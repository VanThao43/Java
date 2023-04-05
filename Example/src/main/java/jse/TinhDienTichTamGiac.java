package jse;

public class TinhDienTichTamGiac {
	static boolean isTriangle(int a, int b, int c) {
		if (a + b > c && b + c > a && c + a > b)
			return true;
		return false;
	}

	static double area(int a, int b, int c) {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static void main(String[] args) {
		int a = Cmn.random(50);
		int b = Cmn.random(50);
		int c = Cmn.random(50);

		System.out.println("3 số a, b, c là: " + a + ", " + b + ", " + c);
		if (isTriangle(a, b, c) == true)
			System.out.println("Diện tích tam giác là: " + area(a, b, c));
		else
			System.out.println("Không phải là tam giác!!");
	}

}
