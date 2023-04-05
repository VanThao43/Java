package cacHamTrongChuoiString;

public class SoSanhChuoi {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "ABC";
		String s3 = "abc";
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		System.out.println("S3: " + s3);

		// Hàm equal: so sánh 2 chuỗi, có phân biệt viết hoa , viết thường
		System.out.println("------------------------------------------");
		System.out.println("Hàm equals: so sánh 2 chuỗi, có phân biệt viết hoa , viết thường");
		System.out.println("S1 giống S2: " + s1.equals(s2));
		System.out.println("S1 giống S3: " + s1.equals(s3));

		// Hàm equalsIgnoreCase: so sánh 2 chuỗi k phân biệt viết hoa, thường
		System.out.println("------------------------------------------");
		System.out.println("Hàm equalsIgnoreCase: so sánh 2 chuỗi k phân biệt viết hoa, thường");
		System.out.println("S1 giống S2: " + s1.equalsIgnoreCase(s2));
		System.out.println("S1 giống S3: " + s1.equalsIgnoreCase(s3));

		System.out.println("------------------------------------------\n\n");
		String sv1 = "Nguyễn Văn T";
		String sv2 = "Nguyễn thị B";
		String sv3 = "Nguyễn H";
		System.out.println("sv1: " + sv1);
		System.out.println("sv2: " + sv2);
		System.out.println("sv3: " + sv3);

		// Hàm compareTo: so sánh 2 chuỗi trả về giá trị dương, âm hoặc = 0, phân biệt
		// chữ hoa, chữ thường
		System.out.println("------------------------------------------");
		System.out.println(
				"Hàm compareTo: so sánh 2 chuỗi trả về giá trị dương, âm hoặc = 0, phân biệt chữ hoa, chữ thường");
		System.out.println("So sánh sv1 và sv2: " + sv1.compareTo(sv2));
		System.out.println("So sánh sv1 và sv3: " + sv1.compareTo(sv3));

		// Hàm compareToIgnoreCase: tương tự compareTo nhưng không phân biệt chữ hoa,
		// chữ thường
		System.out.println("------------------------------------------");
		System.out.println("Hàm compareToIgnoreCase: tương tự compareTo nhưng không phân biệt chữ hoa, chữ thường");
		System.out.println("So sánh sv1 và sv2: " + sv1.compareToIgnoreCase(sv2));
		System.out.println("So sánh sv1 và sv3: " + sv1.compareToIgnoreCase(sv3));

		// Hàm regionMatches => so sánh 1 đoạn
		// regionMatches(bắt đầu chuỗi 1, tên chuỗi 2, bắt đầu chuỗi 2, số kí tự cần so sánh);
		System.out.println("------------------------------------------\n\n");
		System.out.println("Hàm regionMatches => so sánh 1 đoạn");
		String r1 = "TV.C";
		String r2 = "TCTV.vn";
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		boolean check = r1.regionMatches(0, r2, 2, 3);
		System.out.println("So sánh chứ \"TV.\" của 2 chuỗi r1, r2: " + check);

		// Hàm starWith => kiểm tra chuỗi bắt đầu bằng..........
		System.out.println("------------------------------------------\n\n");
		System.out.println("Hàm starWith => kiểm tra chuỗi bắt đầu bằng..........");
		String sdt = "0787163184";
		System.out.println("Số ĐT : " + sdt);
		System.out.println("Kiểm tra số ĐT có bắt đầu = 0787 không: " + sdt.startsWith("0787"));
		System.out.println("Kiểm tra số ĐT có bắt đầu = 0979 không: " + sdt.startsWith("0979"));

		// Hàm endWith kiểm tra chuỗi kết thúc bằng ........... tương tự starWith
		System.out.println("------------------------------------------\n\n");
		System.out.println("Hàm endWith => kiểm tra chuỗi kết thúc bằng ............");
		String tenFile1 = "I love you.jpg";
		String tenFile2 = "Hoc java.pdf";
		System.out.println("File 1: " + tenFile1);
		System.out.println("File 2: " + tenFile2);
		if (tenFile1.endsWith("jpg"))
			System.out.println("File 1 là 1 hình ảnh.");
		else if (tenFile1.endsWith("pdf"))
			System.out.println("File 1 là 1 file PDF.");
		if (tenFile2.endsWith("jpg"))
			System.out.println("File 2 là 1 hình ảnh.");
		else if (tenFile2.endsWith("pdf"))
			System.out.println("File 2 là 1 file PDF.");
		
		// kết hợp lấy đuôi của tenFile2
		System.out.println("------------------------------------------");
		int a = tenFile2.lastIndexOf(".");
		
		// C1: 
//		char c[] = new char[100];
//		tenFile2.getChars(a+1, tenFile2.length(), c, 0);
		
		// C2:
		String s = tenFile2.substring(a+1);
		System.out.println(s);
	}

}
