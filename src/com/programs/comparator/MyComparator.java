package com.programs.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.length()-o1.length();
	}
	

}
