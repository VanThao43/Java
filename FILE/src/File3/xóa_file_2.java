package File3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class xóa_file_2 {

	public static void xoaFile(File file) {
		Path p = file.toPath();
		if (file.isFile()) {
			try {
				Files.delete(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			File[] mangCon = file.listFiles();
			for (File f : mangCon) {
				xoaFile(f);
			}
			try {
				Files.delete(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		File f = new File("C:\\java\\bai tap java\\FILE\\abc");
		xoaFile(f);
	}
}
