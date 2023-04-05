package Test7;

import java.util.ArrayList;
import java.util.Iterator;

public class format {
	
	// Chuẩn hoá chuỗi 
	public static String formatString(String str) {
		char chs[] = {
				'`', '~', '!', '#', '$', '%', '&', '^', '*', '(', ')',
				'-', '_', '+', '=', ':', ';', '\'', '?', '.', ',', '\"',
				'|', '/', '\\', '{', '}', '[', ']', '<', '>', '@'
		};
		
		str = str.trim();
		for (char ch : chs) {
			str.replace(ch, ' ');
		}
		
		
		while (str.indexOf("  ")!=-1) {
			str.replace("  ", " ");
		}
		
		return str;
	}
	
	
	// tính tần suất xuất hiện của các kí tự
	public static java.util.ArrayList<String> freequencyChar(String str, boolean isIgnorecase){
		java.util.ArrayList<String> results = new ArrayList<String>();
		
		if (isIgnorecase) {
			str = str.toLowerCase();
		}
		
		String tmp = str.trim();
		String chs = "";
		char ch;
		for (int i = 0; i<tmp.length(); i++) {
			ch = tmp.charAt(i);
			if (ch != ' ') {
				chs += ch;
				tmp = tmp.replace(ch, ' ');
			}
		}
		
		
		for (int i = 0; i<chs.length(); i++) {
			ch = chs.charAt(i);
			
			int count = 0;
			for (int j = 0; j<str.length(); j++) {
				if (str.charAt(j) == ch) {
					count ++;
				}
			}
			
			results.add("["+ ch + ", " + count +"]");
		}
		
		
		return results;
	}
	
	public static void main(String[] args) {
		String s = "    Chúng     ta    không,thuộc!(*về  nhau";
		
		System.out.println(format.freequencyChar(s, true));
	}
}
