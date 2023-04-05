package java_01;

public class abc {

	public static void main(String[] args) {
		System.out.print("Nhập chiều dài: ");
		int a = (new java.util.Scanner(System.in)).nextInt();
		System.out.print("Nhập chiều rộng: ");
		int b = (new java.util.Scanner(System.in)).nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || j == 0 || i == a - 1 || j == b - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
