package com.java.org;

import java.util.Scanner;

public class Scanner_input {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name:");
		String First_name = sc.next();
		System.out.println("Your name is :" + First_name);

		System.out.println("Enter your age:");
		String Age = sc.next();
		System.out.println("Your age is:" + Age);

		System.out.println("Enter your password:");
		String password = sc.next();
		if (password==26) {
		System.out.println("Your password" + password);
		}
		else {
			
		}
	}
}
