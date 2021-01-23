package com.java.org;

public class Continue_1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if (i == 24 || i == 25) {
				continue;
			}
			System.out.println(i);
		}
	}

}
