package com.santosh.collection.hashset;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs=new HashSet<>();
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
