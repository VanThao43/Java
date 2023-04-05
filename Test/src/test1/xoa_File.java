package test1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class xoa_File {

	public static void copyFile (File f1, File f2) {
			try {
				Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (f1.isDirectory()) {
			File[] file = f1.listFiles();
			for (File f : file) {
				File file_new = new File(f2.getAbsolutePath()+"\\"+f.getName());
				copyFile(f, file_new);
			}
		}
	}
	public static void main(String[] args) {
		File f = new File("C:\\java\\bai tap java\\Test\\Directory5");
		File f1 = new File("C:\\java\\bai tap java\\Test\\Directory10\\Directory5");
		copyFile(f, f1);
	}

}
