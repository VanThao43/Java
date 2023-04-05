package jse;

public class Cmn {
	public static int random(int n) {
		return (int) (Math.random()*n);
	}
	
	public static long tinhGiaiThua(int n) {
		long tich = 1;
		for (int i=1; i<=n; i++) {
			tich *= i;
		}
		return tich;
	}
	
	public static void main(String[] args) {
		Cmn a = new Cmn();
		int m = a.random(20), n = a.random(10);
		System.out.println(+m+", "+n);
		if(m>n) {
			long cmn = (long)a.tinhGiaiThua(m)/(a.tinhGiaiThua(n)*a.tinhGiaiThua(m-n));
			System.out.print("Tổ hợp chập "+n+" của "+m+" là: "+cmn);
		}
		else 
			System.out.println("m, n không thỏa mãn!!");
	}
}
