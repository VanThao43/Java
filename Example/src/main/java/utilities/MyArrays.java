package utilities;

import oop.Person;

import java.lang.reflect.Array;
import java.util.*;


/**
 * Lớp đối tượng cung cấp các chức năng xử lý mảng
 * lớp nghiệp vụ - Business class (tập trung vào các phương thức xử lý, API xử lý)
 * 
 * 
 * @author thaopc
 *
 */
public class MyArrays {
	
	/*
	 * phương thức sinh ngẫu nhiên mảng 1 chiều với n phần tử có kiểu int.
	 */
	public static int [] generateArrays(int n) {
		// khai báo mảng trung gian
		int []arrInt = new int [n];
		
		for (int i = 0; i<arrInt.length; i++) {
			arrInt[i] = (int)(Math.random()*100);
			
//			arrInt[i] = jse.Cmn.random(100);
		}
		
		return arrInt;
	}
	
	public static Integer[] generateArraysV2(int n) {
		Integer[] arrInt= new Integer[n];
		
		for(int i = 0; i<arrInt.length; i++) {
			arrInt[i] = (int)(Math.random()*100);
		}
		
		return arrInt;
	}
	
	
	/**
	 * sinh ngẫu nhiên mảng 2 chiều 
	 * @param rows
	 * @param cols
	 * @return
	 */
	public static int[][] generateArray(int rows, int cols){
		// Khai báo mảng trung gian để lưu trữ
		int [][] arrInt = new int[rows][cols];
		
		for (int i = 0; i<rows; i++) {
			arrInt[i] = MyArrays.generateArrays(cols);
		}
		
		return arrInt;
	}
	
	
	/**
	 * Phương thức sinh ngẫu nhiên 1 danh sách Person
	 * @param n
	 * @return
	 */
	public static Person[] generatePerson(int n) {
		// khai báo 1 danh sách tên
		String [] firstName = {
				"Anh", "Ngọc Anh", "Tuấn Anh", "Anh Tuấn", "Minh"
				,"Linh"
		};
		String[] lastName = {
				"Lê", "Nguyễn", "Trần", "Vũ", "Đào", "Phạm",
				"Phan", "Ngô", "Bùi", "Vũ", "Cao"
		};
		
		// Khai báo mảng trung gian
		Person [] list = new Person[n];
		
		// Sinh ngẫu nhiên các đối tượng
		int index;
		for (int i = 0; i<n; i++) {
			list[i] = new Person();
			
			// Sinh ngẫu nhiên tên
			index = (int)(Math.random()*(firstName.length));
			list[i].setFirstName(firstName[index]);
			
			// sinh ngẫu nhiên họ
			index = (int)(Math.random()*(lastName.length));
			list[i].setLastName(lastName[index]);
			
			// sinh ngẫu nhiên tuổi sinh viên
			index = 18+(int)(Math.random()*5);
			list[i].setAge((byte)index);
		}
		return list;
	}
	
	public static void printArray(int []arrInt) {
		for (int value: arrInt) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	
	public static void printArrayV2(Integer []arrInt) {
		for(Integer x : arrInt) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	
	
	// in mảng 2 chiều
		public static void printArray(int [][]arrInt) {
			for (int[] row: arrInt) {
				MyArrays.printArray(row);
			}
		}
		
		
		
		
	
	/**
	 * selection sort
	 * sắp xếp mảng 1 chiều theo thứ tự được xác định bởi isASC
	 * nếu isASC = true => sắp xếp tăng dần
	 * ngược lại thì sắp xếp giảm dần
	 * @param arrInt: mảng đưa vào
	 * @param isASC: kiểm tra sắp xếp tăng dần hay giảm dần
	 * @return Mảng đã được sắp xếp
	 */
	public static int[] sortArray(int []arrInt, boolean isASC) {
		
		byte ori = (byte) (isASC?1:-1);
		for (int i = 0; i<arrInt.length; i++) {
			for (int j = i+1; j<arrInt.length; j++) {
				if (arrInt[i]*ori>arrInt[j]*ori) {			// cách hay
					int temp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = temp;
				}
			}
		}
		
		return arrInt;
	}
	
	
	
	/**
	 * sắp xếp mảng sử dụng API của java
	 * 
	 * @param n
	 * @return
	 */
	
	public static void sortedArray(Integer[] arrInt, boolean isASC) {
		if(isASC)
			Arrays.sort(arrInt);		// Ngầm định là sắp xếp tăng dần
		else
			Arrays.sort(arrInt, Collections.reverseOrder());	// sắp xếp giảm dần
	}
	
	
	public static int kiemTraSNT(int n) {
		if (n<=1)
			return 0;
		else {
			for (int i = 2; i<=Math.sqrt(n); i++) {
				if (n%i==0)
					return 0;
			}
		}
		return 1;
	}
	
	
	/**
	 * Lọc các số nguyên tố trong mảng và đặt lên đầu mảng, đồng thời sắp xếp theo 1 thứ tự 
	 * xác định được quyết định bởi isASC
	 * @param arrInt
	 * @return 
	 */
	public static int[] filterPrimeArray(int[] arrInt) {
		int [] a = new int[arrInt.length];
		int k = 0, l = arrInt.length;
		for (int i = 0; i<arrInt.length; i++) {
			if (kiemTraSNT(arrInt[i])==1) {
				a[k] = arrInt[i];
				k++;
			}
			if (kiemTraSNT(arrInt[i])==0) {
				a[l-1] = arrInt[i];
				l--;
			}
		}
		
		return a;
	}
	
	
	
	// In danh sách Person C1: 
	public static void printPerson(Person[] list) {
		for (Person person: list) {
			System.out.println(person);
		}
	}
	
	
	/**
	 * Phương thức in danh sách Person với đầu vào là ArrayList được xác định rõ 
	 * đối tượng
	 * 
	 * 
	 * @param list
	 * @param name
	 * @return
	 */
	
	// In danh sách Person C2: 
	public static void printPerson1(ArrayList<Person> list){
		
		// Cách viết từ jdk8
		list.forEach(item->System.out.println(item));
	}
	
	// Tìm kiếm một đối tượng theo tên
	public static Person[] searchPerson(Person[] list, String name) {
		Person [] results = null;
		
		// Đếm số kết quả
		int count = 0;
		for (Person p: list) {
			if (p.getFirstName().contains(name)) {
				count ++;
			}
		}
		
		// khởi tạo bộ nhớ cho mảng kết quả
		results = new Person[count];
		 
		// Ghi nhận các kết quả tìm kiếm vào mảng results
		count = 0; // gán lại về 0 để thực hiện di chuyển và ghi nhận giá trị
		
		for (Person p: list) {
			if (p.getFirstName().contains(name)) {
				results[count++] = p;
			}
		}
		
		return results;
	}
	
	public static ArrayList<Person> searchPersonV2(Person[] list, String name) {
		// Khai báo mảng kết quả
		ArrayList<Person> results = new ArrayList<>();
		
		// Ghi nhận kết quả
		for (Person p: list) {
			if (p.getFirstName().contains(name)) {
				results.add(p);		// thêm đối tượng vào danh sách
			}
		}
		
		return results;
	}
	
	public static void printPerson(ArrayList<Person> list) {
		for (Person p: list) {
			System.out.println(p);
		}
	}
	
	
	/**
	 * Thông kê số lượng từ
	 * 
	 * @param str
	 * @param split_char
	 * @return
	 */
	public static ArrayList<String> statisticWords(String str, String split_char){
		String[] tmp_words= str.split(split_char);
		ArrayList<String> words = new ArrayList<>();
		
		for (String w: tmp_words) {
			if (w!=null && !w.equalsIgnoreCase("")) {
				if (!words.contains(w)) {
					words.add(w);
				}
			}
		}
		
		int counts[] = new int[words.size()];
		
		for (int i = 0; i<words.size(); i++) {
			String s = words.get(i);
			for (String w : tmp_words) {
				if (w.equalsIgnoreCase(s)) {
					counts[i]++;
				}
			}
			
//			System.out.println(words.get(i)+" - "+counts[i]);		C2//
		}
		
		ArrayList<String> results = new ArrayList<String>(words.size());
		
		for (int i = 0; i<words.size(); i++) {
			results.add(words.get(i)+" - "+counts[i]);
		}
		
		
		
		return results;
		
		
		
		
//		words.forEach(item->{
//			int count = 0;
//			for (String w : tmp_words) {
//				if (w!= null && !w.equalsIgnoreCase("")) {
//					if (w.equalsIgnoreCase(item))
//						count++;
//				}														C3//
//				
//			}
//			
//			System.out.println(item+" - "+count);
//			
//		});
	}
	
	
	
	
	/**
	 * 
	 * Thông kê số lượng từ cách 4
	 * 
	 * @param str
	 * @param split_char
	 * @return
	 */
	public static HashMap<String, Integer> statisticWordsV2(String str, String split_char){
		String tmp_word[] = str.split(split_char);
		
		// Khai báo ánh xạ Bảng băm kết quả
		HashMap<String, Integer> results = new HashMap<String, Integer>();
		
		for (String word: tmp_word) {
			if (word!=null && !word.equalsIgnoreCase("")) {
				if (!results.containsKey(word)) {
					results.put(word, 1);
				}
				else {
					results.replace(word, results.get(word)+1);
				}
			}
		}
		
		return results;
	}
	
	
	/**
	 * 
	 * in theo kiểu HashMap
	 * 
	 * @param args
	 */
	
	public static void printStatistic(HashMap<String, Integer>  words) {
		for (Map.Entry<String, Integer> e: words.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}
	
	
	public static void main(String[] args) {
//		int []arrInt = MyArrays.generateArrays(10);
//		
//		MyArrays.printArray(arrInt);
//		
//		System.out.println();
//		
//		arrInt = MyArrays.sortArray(arrInt, false);
//		MyArrays.printArray(arrInt);
//		
//		System.out.println();
//		int c[] = MyArrays.filterPrimeArray(arrInt);
//		MyArrays.printArray(c);
//		
//		System.out.println();
//		int [][]arrInt2 = MyArrays.generateArray(10, 20);
//		MyArrays.printArray(arrInt2);;
//		
//		System.out.println();
//		
//		Integer []arrInt1 = MyArrays.generateArraysV2(20);
//		MyArrays.printArrayV2(arrInt1);
//		MyArrays.sortedArray(arrInt1, false);
//		MyArrays.printArrayV2(arrInt1);
//		
//		System.out.println("\n\n");
//		
//		
//		Person[] p = MyArrays.generatePerson(10);
//		MyArrays.printPerson(p);
//		
//		System.out.println("\n_________________________________________\n");
////		Person[] p1 = MyArrays.searchPerson(p, "Anh");
////		MyArrays.printPerson(p1);
//		
//		ArrayList<Person> arr = MyArrays.searchPersonV2(p, "Anh");
//		MyArrays.printPerson1(arr);
		
		
		
		String s = "abd@mnh@cnd@@@abd@@qua@@cnd@@";
		
		
//		System.out.println(MyArrays.statisticWordsV2(s, "@"));
//		MyArrays.statisticWords(s, "@");
		
		HashMap<String, Integer> words = MyArrays.statisticWordsV2(s, "@");
		
		MyArrays.printStatistic(words);
		
	}
}
