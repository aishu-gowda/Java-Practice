package com.treeset;

import java.util.Comparator;

public class MyComparator implements Comparator<Ladies>{

	@Override
	public int compare(Ladies l1, Ladies l2) {
		
		return l2.lname.compareTo(l1.lname);
	}
 
}
