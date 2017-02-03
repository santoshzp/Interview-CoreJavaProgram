package com.santosh.collection.treeSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortOpeation {
	
	
	public  TreeSet readValue() {
		TreeSet ts=new TreeSet<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many value =");
		int n=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<n;i++){
			System.out.println("Enter value=");
			int v=Integer.parseInt(scanner.nextLine());
			ts.add(v);
		}
		return ts;
		
	}
	
	public void displayOrders(TreeSet t) {
		System.out.println("---------------Acending Order------------");
		Iterator it=t.iterator();
		while(it.hasNext()){
			Object ob=it.next();
			System.out.println(ob);
		}
		
		System.out.println("---------------Desending Order...........");
		Object ob1[]=t.toArray();
		for(int i=ob1.length-1;i>=0;i--){
			System.out.println(ob1[i]);
		}
		System.out.println("Min value="+ob1[0]);
		System.out.println("Max value="+ob1[ob1.length-1]);
	}
	
	

}
