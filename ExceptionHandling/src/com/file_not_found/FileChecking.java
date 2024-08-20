package com.file_not_found;

//import java.io.File;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.*;

public class FileChecking {
	public static void main(String[] args) {
		try {
		File f=new File("F://core_prg/Calulaton.java");	//exception
		FileReader fr=new FileReader(f);
		System.out.println(f);
	}catch(IOException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		System.out.println("Please checkthe file location ");
	}
	}	

}
