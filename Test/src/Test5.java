import java.io.File;

public class Test5 {

	public static void inCayThuMuc(File f, int bac) {
		for (int i=0; i<bac; i++) {
			System.out.print("\t");
		}
		System.out.println("|__"+f.getName());
		if (f.isDirectory()) {
			File[] file = f.listFiles();
			for (File file2 : file) {
				inCayThuMuc(file2, bac+1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\java\\bai tap java\\Test");
		inCayThuMuc(f, 1);
	}

}
