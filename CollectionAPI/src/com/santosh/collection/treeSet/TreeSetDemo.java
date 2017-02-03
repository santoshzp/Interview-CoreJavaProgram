package com.santosh.collection.treeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet hs=new TreeSet<>();
		System.out.println("contatins="+hs);
		System.out.println("Size hs="+hs.size());
		
		//add data HashSet
		
		hs.add(100);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		System.out.println("contatins="+hs);
		System.out.println("Size hs="+hs.size());
		
		// Extract data from HashSet
		System.out.println("--------------Extaract Data-----------------");
		
		Object ob[]	=hs.toArray();
		for(int i=0;i<ob.length;i++){
			System.out.println(ob[i]);
			
			
		}
	}

}
