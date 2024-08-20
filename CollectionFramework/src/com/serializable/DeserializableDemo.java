package com.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("F:\\downloadd\\Serializable\\EmployeeData.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		Employee e=null;
		try {
		while((e=(Employee)ois.readObject())!=null){
			System.out.println(e);
		}
		}
		catch(Exception end) {
			System.out.println("File ended");
		}
	}

}
