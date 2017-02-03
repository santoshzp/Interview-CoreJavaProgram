package com.santosh.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList<>();
		
		System.out.println("Contents ll="+ll);
		System.out.println("Size of ll="+ll.size());
		
		System.out.println("-------Add  data in ll 1d collection framework:------------");
		ll.add(10);
		ll.add(20);
		//ll.add("santosh");
		
		System.out.println("Contents ll="+ll);
		System.out.println("Size of ll="+ll.size());
		
		System.out.println("Add Element  50 is first and 100 is last position");
		ll.add(0, 50);
		ll.add(ll.size(), 100);
		
		System.out.println("Contents ll="+ll);
		System.out.println("Size of ll="+ll.size());
		
		//Extracting data from ll object
		int s=0;
		System.out.println("-----------------------------------------------------------------");
		Iterator iterator = ll.iterator();
		
		while(iterator.hasNext()){
			Object ob=iterator.next();
			Integer integer=(Integer)ob;
			int x=integer;
			System.out.println("x="+x);
			s+=x;
			
		}
		System.out.println("Sum ll="+s);
		
System.out.println("-----------------Extract data from ll using ListIterator------------------");

		ListIterator lt=ll.listIterator();
		
		while(lt.hasNext())
		{
			Object ob=lt.next();
			System.out.println(ob);
		}
		System.out.println("-----------------Backword Direction");
		for(;lt.hasPrevious();){
			Object ob=lt.previous();
			System.out.println(ob);
			
		}
		
		System.out.println("-----------------Extract data from ll using toArray()------------------");
		
		Object ob[]=ll.toArray();
		for(int i=0;i<ob.length;i++){
			System.out.println(ob[i]);
		}
		
		System.out.println("----------------Extract data from ll randam....................");
		
		Object ob1= ll.get(3);
		System.out.println(ob1);
		
		
	}

}
