package de_serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import serialization.Employee;

public class GettingFromFile {
	public static void main(String[] args) throws  Exception  {
		FileInputStream fis=new FileInputStream("F:\\core_prg\\Serialization\\writeObject.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			try(fis;ois) {
				Employee e=null;
				 e=(Employee)ois.readObject();
				 System.out.println(e);
			}
			catch (EOFException  e1) {
				e1.printStackTrace();
			}
	}
 }

