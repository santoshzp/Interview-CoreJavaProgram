package com.santosh.collection.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vectordemo {
	
	public static void main(String[] args) {
		Vector v=new Vector<>();
		System.out.println("Containts="+v);
		System.out.println("size=="+v.size());
		v.add(10);
		v.addElement(20);
		System.out.println("Containts="+v);
		System.out.println("size=="+v.size());
		
		//Extract data
		System.out.println("--------------Extract data-----------");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			Object obj=e.nextElement();
			System.out.println(obj);
		}
	}
	
}
