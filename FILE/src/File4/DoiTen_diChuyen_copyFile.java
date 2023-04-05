package File4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class DoiTen_diChuyen_copyFile {

//	coy thư mục có chứa thư mục con hoặc file con 
	public static void copyThuMuc(File f1, File f2) {
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (f1.isDirectory()) {
			File[]  mangCon = f1.listFiles();
			for (File f : mangCon) {
				File file_new = new File(f2.getAbsoluteFile()+"\\"+f.getName());
				copyThuMuc(f, file_new);
			}
		}
	}
	public static void main(String[] args) {

//		sử dụng file để đổi tên file
//		File f = new File("C:\\java\\bai tap java\\FILE\\Directory1");
//		File f1 = new File ("C:\\java\\bai tap java\\FILE\\Directory5");
//		f1.renameTo(f);

		
//		sử dụng files để đổi tên file
//		File f0 = new File("C:\\java\\bai tap java\\FILE\\vidu.txt");
//		File f2 = new File("C:\\java\\bai tap java\\FILE\\vidu_1_2.txt");
//		try {
//			Files.move(f0.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
//		di chuyển file 
//		File f_2 = new File("C:\\java\\bai tap java\\FILE\\Directory1\\vidu_1_2.txt");
//		try {
//			Files.move(f2.toPath(), f_2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
//		copy file 
		File f3 = new File("C:\\java\\bai tap java\\FILE\\vidu_1_2_copy.txt");
		File f3_copy = new File("C:\\java\\bai tap java\\FILE\\Directory1\\vidu_1_2_copy.txt");
		try {
			Files.copy(f3.toPath(), f3_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f4 = new File ("C:\\java\\bai tap java\\FILE\\Directory1");
		File f5 = new File ("C:\\java\\bai tap java\\FILE\\Directory2");
		copyThuMuc(f4, f5);

	}

}
