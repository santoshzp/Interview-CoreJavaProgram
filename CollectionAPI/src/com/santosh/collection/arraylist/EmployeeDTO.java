package com.santosh.collection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import com.santosh.collection.Employee;

public class EmployeeDTO {
	public ArrayList empDTO() {
		Scanner scanner = new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter employeeId");
		e.setEmployeeId(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter employee Name=");
		e.setEmployeeName(scanner.nextLine());
		System.out.println("Enter Employee Salary");
		e.setEmployeeSalary(Double.parseDouble(scanner.nextLine()));
		
		//add employee details to array list object;
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e);
		al.add(e);
		return al;
		
	}
	
	public void empDAO(ArrayList al) {
		Object ob[]=al.toArray();
		System.out.println("Length="+ob.length);
		System.out.println("=======================================");
		System.out.println("-------------Employee Details----------");
		System.out.println("------------------------------------------------------------");
		
		/*for(int i=0;i<ob.length;i++){
			
		}*/
		for(Object e:ob){
			System.out.println(e);
			Employee e1=(Employee)e;
			System.out.println(e1.getEmployeeId());
			System.out.println(e1.getEmployeeName());
			System.out.println(e1.getEmployeeSalary());
		}
	}
}
