package com.santosh.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map map	=new HashMap();
		map.put(10, 1.3);
		System.out.println(map.get(10));
		System.out.println("size=="+map.size());
		System.out.println("map object="+map);
		System.out.println("isEmpty="+map.isEmpty());
		System.out.println(""+map.hashCode());
		System.out.println(""+map.keySet());
		System.out.println("entrySet="+map.entrySet());
		System.out.println(""+map.containsKey(10));
		System.out.println(""+map.replace(10, 1.3, 1.5));
		System.out.println("clar="+map.remove(10));
		System.out.println(map);
	}
	
	
}
