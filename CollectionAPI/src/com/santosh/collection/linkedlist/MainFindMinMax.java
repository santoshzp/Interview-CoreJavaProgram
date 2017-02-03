package com.santosh.collection.linkedlist;

import java.util.LinkedList;

public class MainFindMinMax {
	public static void main(String[] args) {
		FindMinAndMax f= new FindMinAndMax();
		f.readValue();
		LinkedList ll=f.findMaxMin();
		f.dispalyValue(ll);
		
		
	}
}
