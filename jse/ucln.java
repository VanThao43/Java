package jse;

public class ucln {
	public static int ucln(int a, int b) {
		int ucln = -1;
		if (a * b == 0) {
			ucln = a + b;
		} else {
			while (a != b) {
				if (a > b)
					a = a - b;
				else
					b = b - a;
			}
			ucln = a;
		}
		return ucln;
	}
	
	public static void main(String[] args) {
		int m = jse.random.random(100);
		int n = jse.random.random(100);
		System.out.println("UCLN của "+m+" và "+n+" là: "+jse.ucln.ucln(m, n));
	}
}
