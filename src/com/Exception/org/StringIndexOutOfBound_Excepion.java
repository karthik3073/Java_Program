package com.Exception.org;

public class StringIndexOutOfBound_Excepion {

	public static void main(String[] args) {
//In particular String, the index value is not available it will throw String index Out of bound
// exception.
		String s = "Java";
		char c = s.charAt(10);
		System.out.println(c);
	}

}
