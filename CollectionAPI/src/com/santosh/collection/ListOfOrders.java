package com.santosh.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import com.santosh.model.Orders;

public class ListOfOrders {
	
	public List<Orders> order(){
		Scanner s=new Scanner(System.in);
		List<Orders> l=new ArrayList();
		Orders o=new Orders();
		o.setId(1l);
		o.setOrderNumber(101);
		o.setDate(new Date());
		Customer c=new Customer();
		c.setId(91l);
		c.setName("santosh");
		o.setCustomer(c);
		o.setThali("Panjabi");
		o.setTotalthali(2);
		
		l.add(o);
		
		Orders o1=new Orders();
		o1.setId(2l);
		o1.setOrderNumber(102);
		o1.setDate(new Date());
		Customer c1=new Customer();
		c1.setId(92l);
		c1.setName("ram");
		o1.setCustomer(c);
		o1.setThali("Panjabi");
		o1.setTotalthali(1);
		
		l.add(o1);
		
		
		return l;
		
	}

}
