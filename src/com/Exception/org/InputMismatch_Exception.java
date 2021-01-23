package com.Exception.org;

import java.util.Scanner;

public class InputMismatch_Exception {

	// User need to give integer input but the user trying to input string value,we
	// get input mismatch exception
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("PLs enter value");
		int i = sc.nextInt();
		System.out.println(i);
	}

}
