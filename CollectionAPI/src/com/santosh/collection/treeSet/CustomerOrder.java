package com.santosh.collection.treeSet;

import java.util.ArrayList;
import java.util.List;

import com.santosh.collection.ListOfOrders;
import com.santosh.model.CustomerIO;
import com.santosh.model.Orders;

public class CustomerOrder {
	
		public static void main(String[] args) {
			ListOfOrders s=new ListOfOrders();
			List<Orders> list=s.order();
			CustomerIO c=new CustomerIO();
			List l= new ArrayList();
			System.out.println(list.size());
			for(Orders p:list){
				//c.setOrders();
				
				if(l.contains(c))
				{
					c.setCustomerId(p.getId());
				}
				
				c.setCustomerId(p.getId());
				c.setCustomerName(p.getCustomer().getName());
				//c.setOrders(orders);
				l.add(c);
				
				
				
			}
			
		}
}