package com.serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class SerializableDemo {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("Sunday");
		ar.add("Monday");
		ar.add("Tuesday");
		ar.add("Wednesday");
		ar.add("Thursday");
		ar.add("Friday");
		
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("F:\\downloadd\\Serializable\\SeriaArrayList.TXT"))){
			oos.writeObject(ar);
		}catch(Exception e) {
			
		}
		
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("F:\\downloadd\\Serializable\\SeriaArrayList.TXT"))){
			ArrayList<String> a=(ArrayList<String>)ois.readObject();
			ar.forEach(t -> System.out.println(t));
		}catch(Exception e) {
			
		}
	}

}
