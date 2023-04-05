package cacHamTrongChuoiString;

public class CatChuoiNoiChuoiThayTheChuyenDoi {

	public static void main(String[] args) {
		String s1 = "Nguyen ";
		String s2 = "Van Thao";
		String s3 = s1 + s2;

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);

		// Hàm concat => nối chuỗi
		System.out.println("-------------------------------");
		System.out.println("Hàm concat => nối chuỗi");
		System.out.println("Nối chuỗi s1 và s2: " + s1.concat(s2));

		// Hàm replace => Thay thế
		System.out.println("-------------------------------");
		System.out.println("Hàm replace => thay thế 1 kí tự, 1 đoạn hoặc toàn bộ chuỗi");
		String s4 = s3.replaceAll(s3, "Trần Thị Thảo Ngân");
		System.out.println("s4 thay thế chuỗi s3: " + s4);

		// Hàm toLowerCase, toUpperCase => chuyển đổi viết hoa, viết thường
		System.out.println("-------------------------------");
		System.out.println("Hàm toLowerCase, toUpperCase => chuyển đổi viết hoa, viết thường");
		System.out.println("chuỗi s3 sau khi được viết hoa: " + s3.toUpperCase());

		// Hàm trim => xóa khoảng trắng dư thừa ở đầu, cuỗi chuỗi
		System.out.println("-------------------------------\n\n");
		String s5 = "             Xin chào           ";
		System.out.println("s5: " + s5);
		System.out.println("-------------------------------");
		System.out.println("Hàm trim => xóa khoảng trắng ở đầu, cuỗi chuỗi");
		System.out.println("s5 sau khi xóa khoảng trắng: " + s5.trim());

		// Hàm subString => cắt chuỗi con
		System.out.println("-------------------------------\n\n");
		System.out.println("Hàm subString => cắt chuỗi con");
		System.out.println("chuỗi con cắt từ chuỗi s4: " + s4.substring(9));
		System.out.println("chuỗi con cắt từ chuỗi s4: " + s4.substring(14));

	}

}
