package com.heera.java;
import java.util.*;

public class FirstNonRepeatedCharacterOfString {

	public static void main(String[] args) {
		String x = "SILLYSPIDERS";
		char y[] = x.toCharArray();
		int size = y.length;
		Map<Character, Integer> map = new LinkedHashMap<>();
		int i = 0;
		while (i != size) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldVal = map.get(y[i]);
				int newVal = oldVal + 1;
				map.put(y[i], newVal);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for (Map.Entry<Character, Integer> data : hmap) {
			if (data.getValue() == 1) {
				System.out.println(data.getKey());
				System.exit(0);
			}
		}
	}
}
