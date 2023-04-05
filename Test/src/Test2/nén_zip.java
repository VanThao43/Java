package Test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class nén_zip {

	public static void main(String[] args) {
		List<String> lf = Arrays.asList("C:\\java\\bai tap java\\Test\\Directory1\\vidu.txt","C:\\java\\bai tap java\\Test\\Directory1\\1.txt","C:\\java\\bai tap java\\Test\\Directory1\\2.txt","C:\\java\\bai tap java\\Test\\Directory1\\abc.txt");
		try {
			FileOutputStream fos = new FileOutputStream("C:\\java\\bai tap java\\Test\\fileNen.zip");;
			ZipOutputStream zipOut = new ZipOutputStream(fos);
			
			for (String file : lf) {
				File f = new File(file);
				FileInputStream fis = new FileInputStream(f);
				
				ZipEntry zip = new ZipEntry(f.getName());
				zipOut.putNextEntry(zip);
				byte[] bytes = new byte[1024];
				int length;
				while ((length = fis.read(bytes)) >= 0) {
					zipOut.write(bytes, 0, length);
				}
				fis.close();
			}
			fos.close();
			zipOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
