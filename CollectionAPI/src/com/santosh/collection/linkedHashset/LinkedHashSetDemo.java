package com.santosh.collection.linkedHashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet<>();
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
