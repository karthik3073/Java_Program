package com.java.org;

public class Factorial_Multiplication {

	public static void main(String[] args) {

		int count = 1;

		for (int i = 1; i <= 5; i++) {

			count = count * i;
		}

		System.out.println("factorial for 1 to 5: " + count);
	}
}
