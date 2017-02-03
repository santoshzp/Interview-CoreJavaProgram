package com.santosh.collection.Stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		System.out.println("containts="+s);
		System.out.println("size=="+s.size());
		s.push(10);
		s.push(20);
		System.out.println("containts="+s);
		System.out.println("size=="+s.size());
		s.pop();
		System.out.println("containts="+s);
		System.out.println("size=="+s.size());
		
		
		
	}

}
