package File2;

import java.io.File;
import java.util.Scanner;

public class file2 {

	File file;

	public file2(String tenFile) {
		this.file = new File(tenFile);
	}

	public boolean kiemTraThucThi() {
		return this.file.canExecute();
	}

	public boolean kiemTraDoc() {
		return this.file.canRead();
	}

	public boolean kiemTraGhi() {
		return this.file.canRead();
	}

	public void inDuongDan() {
		System.out.println("Đường dẫn đến file: " + this.file.getAbsolutePath());
	}

	public void inTenFile() {
		System.out.println("Tên file: " + this.file.getName());
	}

	public void kiemTraThuMucHayTapTin() {
		if (this.file.isDirectory())
			System.out.println("File là thư mục.");
		else if (this.file.isFile())
			System.out.println("File là tập tin.");
	}

	public void inDanhSachCacFileCon() {
		System.out.println("Danh sách các file con: ");
		File[] mangCon = this.file.listFiles();
		for (File file : mangCon) {
			System.out.println(file.getName());
		}
	}

	public void inCayThuMuc(File file, int bac) {
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.println("|__" + file.getName());
		if (file.isDirectory()) {
			File[] mangCon = file.listFiles();
			for (File f : mangCon) {
				this.inCayThuMuc(f, bac + 1);
			}
		}
	}

	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên FILE: ");
		String tenFile = sc.nextLine();
		file2 file = new file2(tenFile);

		do {
			System.out.println("____________________________________________\n\n");
			System.out.println("MENU: ");
			System.out.println("1. Kiểm tra file có thể thực thi.");
			System.out.println("2. Kiểm tra file có thể đọc.");
			System.out.println("3. Kiểm tra file có thể ghi.");
			System.out.println("4. In đường dẫn.");
			System.out.println("5. In tên file.");
			System.out.println("6. Kiểm tra file là thư mục hay tập tin.");
			System.out.println("7. In ra danh sách các file con.");
			System.out.println("8. In ra cây thư mục.");
			System.out.println("0. Thoát khỏi chương trình!");
			System.out.println("-------------------------------------------");

			System.out.print("Nhập lựa chọn của bạn: ");
			luaChon = sc.nextInt();
			sc.nextLine();

			switch (luaChon) {
			case 1:
				System.out.println("Kiểm tra file có thể thực thi: " + file.kiemTraThucThi());
				break;
			case 2:
				System.out.println("Kiểm tra file có thể đọc: " + file.kiemTraDoc());
				break;
			case 3:
				System.out.println("Kiểm tra file có thể ghi: " + file.kiemTraGhi());
				break;
			case 4:
				file.inDuongDan();
				break;
			case 5:
				file.inTenFile();
				break;
			case 6:
				file.kiemTraThuMucHayTapTin();
				break;
			case 7:
				file.inDanhSachCacFileCon();
				break;
			case 8:
				System.out.println("___Cây thư mục: ");
				file.inCayThuMuc(file.file, 1);
				break;
			case 0:
				System.out.println("Bạn đã thoát khỏi chương trình!");
				break;
			}

			sc.nextLine();
		} while (luaChon != 0);
	}

}
