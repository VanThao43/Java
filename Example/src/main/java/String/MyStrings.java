package String;

import java.util.ArrayList;

public class MyStrings {
	// đếm số từ trong 1 chuỗi
	
	/**
	 * Chuẩn hoá chuỗi kí tự bất kì
	 * 1 - Loại bỏ các kí tự đặc biệt, không tạo thành từ
	 * 2 - Loại bỏ những dấu cách " " thừa trong chuỗi
	 * 
	 * @param str
	 * @return
	 */
	public static String formatString(String str) {
		char [] chs = {
				'`', '~', '!', '#', '$', '%', '&', '^', '*', '(', ')',
				'-', '_', '+', '=', ':', ';', '\'', '?', '.', ',', '\"',
				'|', '/', '\\', '{', '}', '[', ']', '<', '>', '@'
		};
		
		// Loại bỏ các kí tự khỏi chuỗi
		for (char ch: chs) {
			str = str.replace(ch, ' ');
		}
		
		// Loại bỏ dấu cách trước và sau chuỗi kí tự
		str = str.trim();
		
		while (str.indexOf("  ") != -1) {
			str = str.replace("  ", " ");
		}
		
		return str;
	}
	
	public static int countWord(String str) {
		str = MyStrings.formatString(str);
		int count = 0;
		for (int i = 0; i<str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count ++;
			}
		}
		return count+1;
	}
	
	
	
	/**
	 * Tính tần suất xuất hiện của các kí tự có trong 1 chuỗi bất kì
	 * @param str
	 * @param isIgnoreCase
	 * @return
	 */
	public static java.util.ArrayList<String> freequencyChar(String str, boolean isIgnoreCase){
		 
		java.util.ArrayList<String> fres = new java.util.ArrayList<String>();
	
		//Phân biệt kiểu chữ
		if (isIgnoreCase) {
			str = str.toLowerCase();
		}
		
		// Lấy danh sách các kí tự khác nhau trong dãy ban đầu
		String tmp = str.trim();
		char ch;
		String chs = "";// Lưu các kí tự khác nhau
		for (int i = 0; i<tmp.length(); i++) {
			ch = tmp.charAt(i);
			if (ch != ' ') {
				chs+=ch;
				tmp = tmp.replace(ch, ' ');
			}
		}
		
		// Duyệt các kí tự trong chs
		
		for (int i = 0; i<chs.length(); i++) {
			ch = chs.charAt(i);
			
			int count = 0;
			// Thực hiện đếm từng kí tự
			for (int j = 0; j<str.length(); j++) {
				if (str.charAt(j)==ch) {
					count++;
				}
			}
			
			
			// Đưa vào mảng kết quả
			fres.add("["+ch+", "+count+"]");
		}
		
		return fres;
	}
	
	
	/**
	 * Phương thức cắt một số lượng từ nhất định từ chuỗi kí tự bất kì <br>
	 * << Cắt không được dở dang từ trong chuỗi>>
	 * 
	 * @param args
	 */
	
	public static String getWords(String str, byte nWords) {
		// chuẩn hoá chuỗi
		str = MyStrings.formatString(str);
		
		// xác định vị trí cần cắt
		int i, count = 0; // đếm số dấu cách
		for (i = 0; i<str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count ++;
			}
			
			//kiểm tra số lượng kí tự cách với số lượng từ cần cắt
			if (count >= nWords) {
				break;
			}
		}
		
		// thực hiện cắt chuỗi
		if (i<str.length()-1)
			return str.substring(0,i) + "...";
		else
			return str;
	}
	
	public static void main(String[] args) {
		String s = "    Chúng     ta    không,thuộc!(*về  nhau";
		System.out.println("Chuỗi có "+MyStrings.countWord(s)+" từ.");
		
		
		System.out.println(MyStrings.freequencyChar(s, true));
		System.out.println(MyStrings.getWords(s, (byte)10));
		
	}
}
