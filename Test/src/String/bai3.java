package String;

public class bai3 {
	public static void main(String[] args) {
		System.out.print("Nhập vào 1 chuỗi: ");
		String s = (new java.util.Scanner(System.in)).nextLine().trim().toLowerCase();
		
		s = s.replace("ta", "uda");
		System.out.println(s);
	}
}
