package com.java.org;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repeatwords {

	public static void main(String[] args) {

		String s = "welcome to to java program program simple";

		Map<String, Integer> m = new LinkedHashMap<>();

		String[] allwords = s.split(" ");

		for (String words : allwords) {

			if (m.containsKey(words)) {

				Integer value = m.get(words);

				m.put(words, value + 1);
			}

			else {
				m.put(words, 1);
			}
		}
		System.out.println(m);
	}

}
