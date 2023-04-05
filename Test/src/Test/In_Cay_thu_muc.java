package Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.DomainCombiner;

public class In_Cay_thu_muc {
		
	public static void inCayThuMuc(File f, int bac) {
		for (int i=0; i<bac; i++) {
			System.out.print("\t");
		}
		System.out.println("|__"+f.getName());
		if (f.isDirectory()) {
			File [] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inCayThuMuc(fx, bac+1);
			}
		}
	}
	public static void main(String[] args) {
	
		File f = new File("C:\\java\\bai tap java\\Test");
		inCayThuMuc(f, 1);
		
	}
}
