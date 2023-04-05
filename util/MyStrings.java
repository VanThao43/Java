package util;

import java.util.*;

public class MyStrings {

	public static int countChar(String str, char ch, boolean isIgnoreCase) {
		int count = 0;

		if (isIgnoreCase) {
			str = str.toLowerCase();
			ch = Character.toLowerCase(ch);
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		return count;
	}

	// Chuẩn hóa 1 chuỗi ký tự
	public static String formatString(String str, formatAllow fa) {
		// Danh sách cấc ký tự đặc biệt
		char[] chs = { '`', '~', '!', '@', '#', '$', '%', '^', 
				'&', '*', '(', ')', '_', '-', '=', '+', '{', '}', '[',
				']', ';', ':', '"', '>', '<', '?', '/', '\\', '\'', };

		// Loại bỏ ký tự đặc bieetk trong chuỗi
		for (char ch : chs) {
			str = str.replace(ch, ' ');
		}

		// Loại bỏ dấu cách
		str = str.trim();
		while (str.indexOf("  ") != -1) {
			str = str.replace("  ", " ");
		}

		str = str.replace(" . ", ". ");
		str = str.replace(" , ", ", ");

		// Xử lý theo tên riêng / câu văn bản
		switch (fa) {
		case NAME:
			break;
		case FULLNAME:
			String[] words = str.split(" ");
			String tmp = "";
			for (String w : words) {
				w = w.toLowerCase();
				tmp += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
			}

			str = tmp.trim();
			break;

		case SENTENCE:
			str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
		default:
			break;
		}

		return str;
	}

	public static int countWords(String str) {
		// Chuẩn hóa
		str = MyStrings.formatString(str, formatAllow.DEFAULT);

		return MyStrings.countChar(str, ' ', false) + 1;
	}

	public static HashMap<String, Integer> statisticWords(String str, String ch_split) {

		HashMap<String, Integer> tmp = new HashMap<>();

		String[] tmp_words = str.split(ch_split);
		for (String w : tmp_words) {
			if (!w.equalsIgnoreCase("")) {
				w = w.trim();
				if (tmp.containsKey(w)) {
					tmp.replace(w, tmp.get(w) + 1);
				} else {
					tmp.put(w, 1);
				}
			}

		}
		return tmp;
	}

	public static void printStatistic(HashMap<String, Integer> sta) {

		TreeMap<String, Integer> tmp = new TreeMap<>(sta);

		for (Map.Entry<String, Integer> e : tmp.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "Nguyễn @#$%  Văn    $%^*    Thao  ";
		int count = MyStrings.countChar(str, 'e', true);

		// System.out.print("Có " + count+ " ký tự e");

		System.out.println(MyStrings.formatString(str, formatAllow.FULLNAME));

		// Đếm số từ
		String str2 = "Nguyễn  Văn    Thao  superflexilgadouxious top 1";
		System.out.println(MyStrings.countWords(str2) + " từ");

		//
		String str3 = "@@adc@@mnbd@adc@@oie@adc@@oie@@htm@@@";
		MyStrings.printStatistic(MyStrings.statisticWords(str3, "@"));
	}

}

enum formatAllow {
	NAME, 
	FULLNAME, 
	SENTENCE, 
	DEFAULT
}
