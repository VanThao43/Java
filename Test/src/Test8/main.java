package Test8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class main {
	
	//Thống kế số lượng từ C1
	public static ArrayList<String> statisticWordsV1 (String str, String split_char){
		String []tmp_word = str.split(split_char);
		
		ArrayList<String> words = new ArrayList<String>();
		for (String w : tmp_word) {
			if (w!=null && !w.equalsIgnoreCase("")) {
				if (!words.contains(w)) {
					words.add(w);
				}
			}
		}
		
		int []count = new int[words.size()];
		
		for (int i = 0; i<words.size(); i++) {
			String s = words.get(i);
			for (String w : tmp_word) {
				if (w.equalsIgnoreCase(s)) {
					count[i]++;
				}
			}
		}
		
		ArrayList<String> results = new ArrayList<String>();
		
		for (int i = 0; i<words.size(); i++) {
			results.add(words.get(i) + " - " + count[i]);
		}
		
		
		
		return results;
	}
	
	// Thống kê số lượng từ C2:
	public static HashMap<String, Integer> statisticWordsV2(String str, String split_char){
		HashMap<String, Integer> results = new HashMap<String, Integer>();
		String [] tmp_words = str.split(split_char);
		for (String w : tmp_words) {
			if (w!=null && !w.equalsIgnoreCase("")) {
				if (!results.containsKey(w)) {
					results.put(w, 1);
				}
				else {
					results.replace(w, results.get(w) + 1);
				}
			}
		}
		
		
		
		return results;
	}
	
	
	//	In thống kê số lượng từ C2: 
	public static void printStatisticWordsV2(HashMap<String, Integer> results) {
		for (Map.Entry<String, Integer> e : results.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhập vào chuỗi: ");
		String s = (new java.util.Scanner(System.in)).nextLine();
		java.util.ArrayList<String> results = main.statisticWordsV1(s, "a");
		System.out.println(results + "\n");
		
		main.printStatisticWordsV2(main.statisticWordsV2(s, "a"));
	}

}
