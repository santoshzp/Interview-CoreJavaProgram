package com.santosh.collection.treeSet;

import java.util.TreeSet;

import javax.swing.SortingFocusTraversalPolicy;

public class MainSroting {
	public static void main(String[] args) {
		SortOpeation s=new SortOpeation();
	
		TreeSet t=s.readValue();
		s.displayOrders(t);
	}

}
