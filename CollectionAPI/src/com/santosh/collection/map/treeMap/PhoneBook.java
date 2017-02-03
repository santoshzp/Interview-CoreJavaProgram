package com.santosh.collection.map.treeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
	
	TreeMap tm;
	Scanner s=new Scanner(System.in);
	public PhoneBook(){
		tm=new TreeMap();
	}
	
	public void addContact(){
		System.out.println("------------------------------");
		System.out.println("Enter how many contact ");
		int n=Integer.parseInt(s.nextLine());
		
		for(int i=0;i<n;i++){
			System.out.println("Enter mobileNo");
			String contact=s.nextLine();
			System.out.println("Enter Name=");
			String name=s.nextLine();
			
			tm.put(contact, name);
			
		}
		
		
	}
	public void diplayContact(){
		System.out.println("----------------------------------------");
		System.out.println("----Contact Details-----");
		System.out.println("----------------------------------------");
		Set s=tm.entrySet();
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Object kobj=it.next();
			Map.Entry me=(Map.Entry)kobj;
			
			Object contact=me.getKey();
			Object name=me.getValue();
			System.out.println("Name="+name+"  : "+contact);
						
		}
		
	}
	public void  searchContact() {
		System.out.println("Enter Name");
		
		String name=s.nextLine();
		Object cn=tm.get(name);
		if(cn!=null){
			System.out.println(name+":"+name);
		}
		else 
			System.out.println("dose not eXIt");
	}
	
}
