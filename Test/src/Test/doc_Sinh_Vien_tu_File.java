package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class doc_Sinh_Vien_tu_File {
	public static void main(String[] args) {
		File f = new File("C:\\java\\bai tap java\\Test\\sinhVien.txt");
		try {
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			sinhVien sv = (sinhVien) ois.readObject();
			System.out.println(sv);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
