package File;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) {
		File f = new File("C:\\java\\bai tap java\\FILE");
//		hàm exists() => Kiểm tra file có tồn tại hay không
		System.out.println("Kiểm tra file có tồn tại: " + f.exists());

//		Hàm mkdir() => tạo ra 1 thư mục mới
		File f1 = new File("C:\\java\\bai tap java\\FILE\\Directory1"); // tạo ra thư mục Directory1
		f1.mkdir();

//		Hàm mkdirs() => tạo ra nhiều thư mục cùng lúc
		File f2 = new File("C:\\java\\bai tap java\\FILE\\abc\\Directory1\\Directory2\\123\\directory3");
		f2.mkdirs();

//		Hàm createNewFile() => tạo ra một tập tin mới (new file), chú ý có try catch
//		Một số đuôi trong tập tin: doc, txt, jpg, xls, pdf, ...
		File f3 = new File("C:\\java\\bai tap java\\FILE\\Directory2\\Vidu.png");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
