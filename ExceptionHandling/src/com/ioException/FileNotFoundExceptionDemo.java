package com.ioException;
//import java.io.File;


//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.*;
//ioException arises when failure in input and output
//this exception derives some exceptions are
//1) FileNotFoundException
//2) UnsupportedEncodingException
public class FileNotFoundExceptionDemo {
	public static void main(String[] args) {
		try {
		File f=new File("F://core_prg/Calulation.java");	//exception
		FileReader fr=new FileReader(f);
		System.out.println(f);
	}catch(IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		System.out.println("Please check the file location ");
	}
	}	

}
