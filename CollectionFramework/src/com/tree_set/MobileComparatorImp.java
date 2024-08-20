package com.tree_set;

import java.util.Comparator;

public class MobileComparatorImp implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return (int) -(o1.getPrice()-o2.getPrice());
	}
	
}
