package com.Exception.org;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBound_Excepion {
//In a list, the index value is not available it will throw index out of bound exception.
	public static void main(String[] args) {
		List<Integer> ex = new ArrayList<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		System.out.println(ex.get(3));
		System.out.println(ex.get(10));

	}

}
