package File6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;

public class Doc_1_SinhVien_tu_File {

	public static void main(String[] args) {
		File f = new File("C:\\java\\bai tap java\\FILE\\file1.java");
		try {
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);

			SinhVien sv = (SinhVien) ois.readObject();
			System.out.println(sv);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
