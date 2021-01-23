package com.java.org;

public class PrimeNumber {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			int a = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					a++;
				}

			}
			if (a == 0) {
				System.out.println("The prime number is:" + i);
			}
		}
	}
}