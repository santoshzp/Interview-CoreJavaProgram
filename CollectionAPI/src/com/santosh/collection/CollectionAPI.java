package com.santosh.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionAPI {
	
	public static void main(String args[]){
		
		Collection<Employee> coll	= new ArrayList<Employee>();
		Collection<Employee> collection	= new 	ArrayList<Employee>();
		
		Employee e	=	new Employee();
		e.setEmployeeId(10);
		e.setEmployeeName("santosh");
		e.setEmployeeSalary(500000d);
				
		//coll.add(e);//1
		collection.add(e);
		coll.addAll(collection);
		Iterator<Employee> iterator = coll.iterator();
		System.out.println("==============================Result===================");
		while(iterator.hasNext()){
			Employee emp	=	(Employee)iterator.next();
			
			System.out.println(emp.toString());
			System.out.println(emp.getEmployeeId());
			System.out.println(emp.getEmployeeName());
			System.out.println(emp.getEmployeeSalary());
			
		}
		
		System.out.println("==========================End==========================");
	}
	
}