package com.santosh.collection.Properties;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesDemo {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter propeties file");
			String filename=s.nextLine();
			FileInputStream fis=new FileInputStream(filename);
			
			Properties p=new Properties();
			p.load(fis);
			
			
			System.out.println("driver Name:"+p.getProperty("driver"));
			System.out.println("Url name="+p.getProperty("url"));
			System.out.println("User Name="+p.getProperty("userName"));
			System.out.println("Password="+p.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
