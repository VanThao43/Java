package File7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Nen_nhieu_File {
	public static void main(String[] args) {
		List<String> lf = Arrays.asList("C:\\java\\bai tap java\\FILE\\Directory1\\vidu.txt","C:\\java\\bai tap java\\FILE\\Directory1\\abc.doc","C:\\java\\bai tap java\\FILE\\Directory1\\file.xls");
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\java\\bai tap java\\FILE\\vidu.zip");
			ZipOutputStream zipOut = new ZipOutputStream(fos);
			
			for (String f : lf) {
				File file = new File(f);
				FileInputStream fis = new FileInputStream(file);
				
				ZipEntry zip = new ZipEntry(file.getName());
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

	/*
	 * "C:\\java\\bai tap java\\FILE\\Directory1\\vidu.txt","C:\\java\\bai tap java\\FILE\\Directory1\\abc.doc","C:\\java\\bai tap java\\FILE\\Directory1\\file.xls"
	 */
		
}
