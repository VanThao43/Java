package Test;

import java.io.File;

public class Test_file {

	public static void inCayThuMuc(File f, int bac) {
		for (int i=0; i<bac; i++) {
			System.out.print("\t");
		}
		System.out.println("|__"+f.getName());
		if (f.isDirectory()) {
			File file[] = f.listFiles();
			for(File file1: file) {
				inCayThuMuc(file1, bac+1);
			}
		}
	}

	public static void main(String[] args) {
		File f = new File("C:\\java\\bai tap java\\Test\\Directory5");
		File f2 = new File("C:\\java\\bai tap java\\Test");
		inCayThuMuc(f, 0);
	}
}
