package com.Exception.org;

public class NumberFormat_Exception {

	public static void main(String[] args) {

		// if we give numbers in the string, we can convert the data type into integer.
		// but if we give num and
		// char combination in the string, we can't convert to integer.
		// if we trying to convert, it will throw number format exception

		String s = "1234";
		System.out.println(s + 5);// string +5
		int i = Integer.parseInt(s);// parseInt convert string into Int
		System.out.println(i + 5);// Integer +5
		String s1 = "123Abc45";
		int j = Integer.parseInt(s1);
		System.out.println(j + 5);
	}

}
