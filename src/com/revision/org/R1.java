package com.revision.org;

public class R1 {

	public static void main(String[] args) {

		String s = "welcome";
		String a = " ";

		for (int i = s.length() - 1; i >= 0; i++) {
			a = a + s.charAt(i);

		}
		System.out.println(a);
	}

}
