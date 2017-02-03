package com.santosh.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class FindMinAndMax {
	int a[];
	
	public void readValue(){
		Scanner scanner =	new Scanner(System.in);
		System.out.println("Enter How many value =");
		int n=Integer.parseInt(scanner.nextLine());
		a=new int[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Enter Value=");
			a[i]=Integer.parseInt(scanner.nextLine());
		}
	}
	
	public LinkedList findMaxMin() {
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++){
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		
		LinkedList ll=new LinkedList();
		ll.add("-------------------------------------");
		ll.add("Max value ="+max);
		ll.add("Min value="+min);
		ll.add("-------------------------------------");
		
		return ll;
	}
	
	public void dispalyValue(LinkedList l) {
		System.out.println("Result Card");
		
		Iterator  it=l.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
		
	}

}
