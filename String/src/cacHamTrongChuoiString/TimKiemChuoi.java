package cacHamTrongChuoiString;

public class TimKiemChuoi {

	public static void main(String[] args) {
		String s1 = "Xin chào thầy cô, xin chào bạn bè, Xin chào!!";
		String s2 = "Xin chào";
		// Hàm indexOf => Tìm kiếm từ đầu chuỗi => trả về vụ trí của chuỗi này trong chuỗi kia
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("-------------------------");
		System.out.println("Hàm indexOf => tìm kiếm từ đầu chuỗi => trả về vị trí của chuỗi này trong chuỗi kia");
		System.out.println("Vị trí của s2 trong s1: "+s1.indexOf(s2));
		System.out.println("Vị trí của s2 trong s1, tìm kiếm bắt đầu từ kí tự thứ 2: "+s1.indexOf(s2,2));
		
		System.out.println("---------------------------\n\n");
		String s3 = "à";
		System.out.println("s3: "+s3);
		System.out.println("---------------------------");
		System.out.println("Hàm lastIndexOf => tìm kiếm từ cuối chuỗi trở lại, giống indeOf");
		System.out.println("vị trí của s3 trong s1 (tìm từ cuối chuỗi trở lên): "+s1.lastIndexOf(s3));
	}

}
