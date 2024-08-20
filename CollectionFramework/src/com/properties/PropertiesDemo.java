package com.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {		
		FileReader fr=new FileReader("F:\\download\\CollectionFramework\\ddb.properties.txt");
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p.getProperty("driver"));
		System.out.println(p.getProperty("Username"));
		System.out.println(p.getProperty("Password"));
	}
}
