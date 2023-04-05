package Test11;

public class main {
	public static void main(String[] args) {
		String s;

		System.out.print("Nhập vào chuỗi: ");
		s = (new java.util.Scanner(System.in)).nextLine().trim().toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			int j = i + 1;
			while (j < s.length()) {
				if (s.charAt(i) == s.charAt(j)) {
					s = s.substring(0, j) + s.substring(j + 1);
				}
				j++;
			}
		}

		System.out.println(s.length());
	}
}
