package com.task_13feb;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class StudentRead {
	public static void main(String[] args) throws Exception {
		var fin=new FileInputStream("F:\\downloadd\\CollectionFramework\\mcq's_9feb.txt");
		var ois=new ObjectInputStream(fin);
		try(fin;ois) {
			Student s=null;
				while((s=(Student)ois.readObject())!=null) {
					System.out.println(s);
				}
				
		}catch(EOFException e) {
			System.out.println("End File Reached");
			System.out.println(e.getMessage());
		}
	}

}
