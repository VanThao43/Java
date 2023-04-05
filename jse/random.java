package jse;

public class random {
	public static int random(int n) {
		return (int)(Math.random()*n);
	}
	
	public static void main(String[] args) {
		System.out.println(jse.random.random(10));
	}
}
