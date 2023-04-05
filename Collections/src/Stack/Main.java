package Stack;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Stack<String> stackChuoi = new Stack<String>();

		// stackChuoi.push("Giá trị") => đưa từng giá trị vào stack
		// stackChuoi.pop("Giá trị") => lấy từng giá trị ra, xóa khỏi stack
		// stackChuoi.peek("giá trị") => lấy giá trị ra nhưng không xóa khỏi stack
		// stackChuoi.clear() => xóa hết các phần tử trong chuỗi
		// stackChuoi.contains("Giá trị") => xác định giá trị có tồn tại trong stack hay
		// không
		// stackChuoi.size() => lấy độ dài của chuỗi stack

		// Ví dụ đảo ngược chuỗi
		System.out.print("Nhập vào chuỗi: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			// kí tự + "" => tạo thành chuỗi
			stackChuoi.push(s.charAt(i) + "");
		}
		System.out.print("Chuỗi đảo ngược: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}

		// chuyển từ hệ thập phân sang hệ nhị phân
		System.out.println("\n------------------------------");
		System.out.print("Nhập vào số n: ");
		int n = sc.nextInt();
		int m = n;
		while (n != 0) {
			stackChuoi.push(n % 2 + "");
			n /= 2;
		}
		System.out.print("Số nhị phân của " + m + " là: ");
		int a = stackChuoi.size();
		for (int i = 0; i < a; i++) {
			System.out.print(stackChuoi.pop());
		}
	}

}
