package file5;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Doc_du_lieu_tu_File {

	public static void main(String[] args) {
		/*	Cách 1:
		File f = new File("C:\\java\\bai tap java\\FILE\\file.txt");
//		Hàm BufferedReader(Đường dẫn, bảng mã) => đọc dữ liệu từ file (Phải có try catch)
		
		try {
			
//			Hàm readLine => đọc từng dòng trong file
			
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while (true) {
				line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/**
		 * Cách 2:
		 */
		
		File f2 = new File("C:\\java\\bai tap java\\FILE\\file.txt");
		try {
			List<String> duLieu = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for (String line : duLieu) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
