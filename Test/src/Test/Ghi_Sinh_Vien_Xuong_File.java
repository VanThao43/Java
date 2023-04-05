package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Ghi_Sinh_Vien_Xuong_File {

	public static void main(String[] args) {
		File f = new File("C:\\java\\bai tap java\\Test\\sinhVien.txt");
		try {
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			sinhVien sv = new sinhVien(21020938, "Nguyễn Văn Thao", "Nam", "ĐHQGHN", "QH2021", 9.5);
			
			oos.writeObject(sv);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
