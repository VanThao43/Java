package file5;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class ghi_du_lieu_vao_file {

	public static void main(String[] args) {
		try {
//			PrintWriter => dùng để ghi dữ liệu vào file
			
			PrintWriter pw = new PrintWriter("C:\\java\\bai tap java\\FILE\\file.txt", StandardCharsets.UTF_8);
			pw.println("Xin chào, hello world, i am CTV");
			pw.print("Dữ liệu: ");
			pw.print(3.14);
			pw.println(" là số PI");
		
			SinhVien sv = new SinhVien("21020938", "Nguyễn Văn Thao");
			pw.print(sv);
			pw.flush(); 	// giống trong C
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
