package com._07jan_mcqs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
	public static void Hello(String name){
	File f=new File("C:/");
	try {
		FileReader fr=new FileReader(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		Hello("hi");
		
		
	}

}
