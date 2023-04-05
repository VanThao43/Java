package File6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ghi_mot_SinhVien_xuong_file {
//	ghi thử 1 bạn sinh viên xuống file
	public static void main(String[] args) {

		try {
//			có thể tạo ra file mới chưa tồn tại giống trong C
			File f = new File("C:\\java\\bai tap java\\FILE\\file.java");
			
//			OutputStream => giúp ghi xuống file
			
			OutputStream os = new FileOutputStream(f);
			
//			ObjectOutputStream => giúp ghi được 1 đối tượng xuống file
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			SinhVien sv = new SinhVien("21020938", "Nguyễn Văn Thao", 2003, 9);
			oos.writeObject(sv);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
