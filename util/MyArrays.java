package util;
import java.util.*;
import Objects.Person;

public class MyArrays {
	
	/**
	 * Hàm tạo mảng 1 chiều ngẫu nhiên
	 * @param n số phần tử mảng
	 * @return
	 */
	public static int[] generateArray(int n) {
		int [] arrInt = new int[n];
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int)(Math.random()*100);
		}
		
		
		return arrInt;
	}
	
	/**
	 *Hàm tạo mảng 2 chiều
	 * @param rows 
	 * @param cols
	 * @return 
	 */
	public static int[][] generateArray(int rows, int cols) {
		int [][] arrInt = new int [rows][cols];
		for (int i = 0; i < rows; i++) {
			//sử dụng hàm tạo mảng 1 chiều tạo từng dòng của mảng 2 chiều;
			arrInt[i] = MyArrays.generateArray(cols);
		}
		
		
		return arrInt;
	}
	
	public static void printArray(int [] arrInt) {
		
		//Cách 1:
//		for (int i = 0; i < arrInt.length; i++) {
//			System.out.println(arrInt[i]+" ");
//		}
		
		//Cách 2 - JDK5
//			for(int value: arrInt) {
//					System.out.println(value+" ");
//			}
			
		//Cách 3 - sử dụng đối tượng Arrays(chuyển đối mảng nguyên thủy sang mảng đối tượng)
		
		Integer[] data = new Integer[arrInt.length];
		Arrays.setAll(data, i -> arrInt[i]);
		
		System.out.print(Arrays.toString(data));
		System.out.println(Arrays.toString(arrInt));

	}
	
	
	
	/**
	 * Phương thức in ra mảng 2 chiều
	 * @param arrInt
	 */
	public static void printArray(int [][] arrInt) {
		//cách 1- gọi phương thức in mảng 1 chiều
//		for(int row: arrInt) {
//			MyArrays.printArray(row);
//		}
		
		
		//cách 2 - sử dụng Arrays
		//In mang 2 chiều thành 1 dòng
		System.out.println(Arrays.deepToString(arrInt));
		
		
	}
	
	
	/**
	 * sắp xếp dãy sử dụng bubleSort
	 * @param arrInt mảng cần sắp xếp
	 * @param isINC sắp xếp theo tăng dần hay giảm dần, 
	 * @return
	 */
	public static int[] sortedArray(int[] arrInt, boolean isINC) {
		
		byte ori = (byte)(isINC?1:-1);
		//Thực hiện sắp xếp
		for (int i = 0; i < arrInt.length-1; i++) {
			for(int j=arrInt.length-1;j>i;j--) {
				if(arrInt[j]*ori < arrInt[j-1]*ori ) {
					int tmp = arrInt[j];
					arrInt[j] = arrInt[j-1];
					arrInt[j-1] = tmp;
				}
			}
		}
		
		
		return arrInt;
	}
	
	public static Integer[] sortedArrayV2(Integer[] tmp, boolean isINC) {
		
		Integer[] data = new Integer[tmp.length];
		Arrays.setAll(data,  i-> tmp[i]);
		
		if(isINC) {
			Arrays.sort(data);
		} else {
			Arrays.sort(data, Collections.reverseOrder());
		}
		return data;
		
		
	}
	
	
	public static int[][] sortedArray(int[][] arrInt, boolean isINC) {
		int rows = arrInt.length;
		int cols = arrInt[0].length;
		
		Integer[] tmp = new Integer[rows*cols];
		
		//Sao chép giá trị
		int r = 0, c = 0;
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = arrInt[r][c++];
			
			if(c == cols) {
				r++;
				c = 0;
			}
		}
		
		tmp = MyArrays.sortedArrayV2(tmp, isINC);
		
		//Chuyển bề mảng hai chiều
		r = 0;
		c= 0;
		for(int i=0; i<tmp.length; i++) {
			arrInt[r][c++] = tmp[i];
			
			if(c==cols) {
				r++;
				c=0;
			}
		}
		
		return arrInt;
		
	}
	
	public static Person[] generatePerson(int n) {
		//khởi tạo mảng 
		Person [] list = new Person[n];
		//Danh sách tênl
		String[] firstNames = {
				"Anh","Bảo Anh","Nghĩa","Hùng","Huyền","Trang","Minh","Hân"
				,"Minh Anh","Hoàng","Thủy","Phan","Đạt","Ngọc","Quý","Huy","Tùng","Thủy","Tuấn","Vũ",
				"Linh"
		};
		
		String [] lastNames = {
				"Nguyễn","Hoàng","Phạm","Lê","Bùi","Đàm","Ngô","Hồ","Trần","Lương","Vương","Vi","Lò"
		};
		
		
		for (int i = 0; i < n; i++) {
			//cấp phát địa chỉ trong bộ nhớ cho phần tử mảng
			list[i] = new Person();
			
			int index;
			//Ngẫu nhiên chỉ số để lấy tên trong firstName
			 index = (int)(Math.random()*firstNames.length);
			list[i].setFirstName(firstNames[index]);
			
			//Ngẫu nhiên họ
			 index = (int)(Math.random()*lastNames.length);
			list[i].setLastName(lastNames[index]);
			
			//Ngẫu nhiên tuổi
			index = 18+ (int)(Math.random()*5);
			list[i].setAge((byte)index);
			
		}
		
		return list;
	}
	
	
	public static void printPerson(Person [] list) {
		for (Person person : list) {
			System.out.println(person);
		}
		
	}
	
	public static void printPerson(ArrayList<Person> list) {
		//cách 4 - sử dụng biểu thức lambda trong JAVA 8
		list.forEach(item->System.out.println(item));
	}
	
	public static Person[] searchPerson(Person[] list, String name) {
		//Khai báo mảng kết quả;
		Person[] results = null;
		//đếm số kết quả
		int count = 0;
		for (Person p : list) {
			if(p.getFirstName().contains(name)) {
				count++;
			}
		}
		
		
		
		//Khởi tạo mảng kq với số phần tử = số lượng phần tử tìm đc để tiết kiệm bộ nhớ;
		results = new Person[count];
		
		//ghi nhận từng kết quả
		count = 0;
		
		for (Person p : list) {
			if(p.getFirstName().equalsIgnoreCase(name)) {
				results[count] = p;
				count++;
			}
		}
		
		return results;
 	}
	
	
	
	/**
	 * 
	 * @param list
	 * @param name
	 * @return
	 */
	public static ArrayList<Person> searchPersonV2(Person[]list, String name) {
		
		//Mảng kết quả
		ArrayList<Person> results = new ArrayList<Person>();
		
		//Ghi nhận kết quả
		for (Person person : results) {
			if(person.getFirstName().contains(name)) {
				results.add(person);
			}
		}
		
		return results;
		
	}
	
	
	
	
	//Sắp xếp tên theo thứ tự alphabet
	public static ArrayList<Person> sortedByAge(Person[] list, boolean isINC) {
		ArrayList<Person> tmp = new ArrayList<>();
		
		Collections.addAll(tmp, list);
		
		sortedByName s = new sortedByName();
		
		if(isINC) {
			Collections.sort(tmp, s);
			
		} else {
			Collections.sort(tmp, s.reversed());
		}
		
		return tmp;
		
	}
	
		
	public static void main(String[] args) {
//		Person[] list = generatePerson(20);
//
//		printPerson(list);
//		
//		System.out.println("\n=========================================================================\n");
//		//tìm kiếm person
//		ArrayList<Person> results = MyArrays.sortedByAge(list, true);
//		MyArrays.printPerson(results);
		
		int[][] arrInt = MyArrays.generateArray(5, 10);
		
		MyArrays.printArray(arrInt);
		
		System.out.print("----------------------\n");
		int[][] results = MyArrays.sortedArray(arrInt, true);
		
		MyArrays.printArray(results);
		
	}
	
	
	
//close class tag		
}

class sortedByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
		String name1 = o1.getFirstName().trim();
		String name2 = o2.getFirstName().trim();
		
		
		//Chỉ lấy tên sau cùng (1 từ)
		int at = name1.lastIndexOf(' ');
		if(at!=-1) {
			name1 = name1.substring(at+1);
		}
		
		at = name2.lastIndexOf(' ');
		if(at!=-1) {
			name2 = name2.substring(at+1);
		}
		
		
		return name1.compareToIgnoreCase(name2);
	}
	
}