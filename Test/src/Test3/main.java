package Test3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class main {

	public static void main(String[] args) throws IOException {
		List<String> tenFile = Arrays.asList("C:\\java\\bai tap java\\Test\\test1", "C:\\java\\bai tap java\\Test\\test2");
		FileOutputStream
		fos = new FileOutputStream("C:\\java\\bai tap java\\Test\\compressed.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		
		for (String file : tenFile) {
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
	}

}
