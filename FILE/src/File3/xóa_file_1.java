package File3;

import java.io.File;

public class xóa_file_1 {

	// xóa thư mục khi bên trong có thư mục, file con
	public static void xoaThuMuc(File file) {
		if (file.isFile())
			file.delete();
		else {
			File[] mangCon = file.listFiles();
			for (File f : mangCon) {
				xoaThuMuc(f);
			}
			file.delete();
		}
	}

	public static void main(String[] args) {

//		Hàm .delete() => xóa file, thư mục và trả về kết quả true or false
//		Hàm .deleteOnExit => xóa file, thư mục và không trả về kết quả gì hết
//		cả 2 hàm chỉ xóa được file hoặc thư mục rỗng
		File f = new File("C:\\java\\bai tap java\\FILE\\abc");
//		System.out.println(f.delete()); 
//		f.deleteOnExit();

//		xóa thư mục khi bên trong có file, thư mục con
		xoaThuMuc(f);
	}

}
