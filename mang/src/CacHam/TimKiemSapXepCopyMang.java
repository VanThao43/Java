package CacHam;

import java.util.Arrays;

public class TimKiemSapXepCopyMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 2, 5, 1, 9, 3, 6, 4, 8 };
		int b[] = new int[10];

		// Hàm sort => sắp xếp mảng tăng dần
		System.out.println("Mảng a bđ: " + Arrays.toString(a));
		System.out.println("Hàm sort => sắp xếp tăng dần");
		Arrays.sort(a);
		System.out.println("Mảng a sau khi sx tăng dần: " + Arrays.toString(a));

		System.out.println("---------------------------");
		// Hàm binarySearch => tìm kiếm phần tử trong mảng sau khi đã sắp xếp tăng dần
		System.out.println("Hàm binarySearch => tìm kiếm phần tử trong mảng sau khi đã sắp xếp tăng dần");
		System.out.println("Phần tử 3 là phần tử thứ " + Arrays.binarySearch(a, 3) + " trong mảng");
		
		System.out.println("---------------------------");
		// Sắp xếp giảm dần
		Arrays.sort(a);
		a = sapXep(a);
		System.out.println("Mảng a sau khi sắp xếp giảm dần là: " + Arrays.toString(a));

		System.out.println("---------------------------");
		// Hàm fill => điền giá trị vào trong mảng
		System.out.println("Hàm fill => điền giá trị vào trong mảng");
		Arrays.fill(b, 3);
		System.out.println("Mảng b sau khi điền giá trị là: " + Arrays.toString(b));

		System.out.println("---------------------------");
		SinhVien sv1 = new SinhVien(21020938, "Nguyen Van Thao", "12A6", 9.5);
		SinhVien sv2 = new SinhVien(21020536, "Nguyen Thị B", "12D1", 9.5);
		SinhVien sv3 = new SinhVien(20020302, "Nguyen Thanh Thuy", "12A5", 9.5);

		SinhVien x[] = { sv1, sv2, sv3 };
		System.out.println("Mảng sinh viên trước khi sắp xếp theo tên: \n" + Arrays.toString(x));
		Arrays.sort(x);
		System.out.println("Mảng sinh viên sau khi sắp xếp theo tên: \n" + Arrays.toString(x));

		System.out.println("---------------------------");
		int d = Arrays.binarySearch(x, sv2);
		System.out.println("Sinh viên thứ 2 ở vị trí thứ " + Arrays.binarySearch(x, sv2) + " trong mảng");
	}

	static int[] sapXep(int[] x) {
		int a[] = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			a[index] = x[i];
			index++;
		}
		return a;
	}
}
