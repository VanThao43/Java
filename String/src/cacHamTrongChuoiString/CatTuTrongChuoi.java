package cacHamTrongChuoiString;

import java.util.Arrays;

public class CatTuTrongChuoi {

	public static void main(String[] args) {
		String s = "Nguyễn Văn Thao";
		String c[] = s.split(" ");
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		String s3 = "Xin chào mình là Thao, mình là sinh viên. Mình học tại trường đại học quốc gia Hà Nội!";
		String c1[] = s3.split(",|\\.|\\ ");
		System.out.println(Arrays.toString(c1));
	}

}
