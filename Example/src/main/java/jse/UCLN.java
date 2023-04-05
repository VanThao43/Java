package jse;

public class UCLN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Cmn.random(100), b = Cmn.random(100);
		int m = a, n = b;
		int UCLN;
		if (a == 0 || b == 0)
			UCLN = a + b;
		else {
			while (a != b) {
				if (a > b)
					a = a - b;
				else
					b = b - a;
			}
			UCLN = a;
		}
		System.out.println("UCLN của " + m + " và " + n + " là: " + UCLN);

	}

}
