package com.concurrent_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



//public class TraditionalDrawback 
//{
//	public static void main(String[] args) 
//	{
//		ArrayList<String> arl = new ArrayList<>();   
//		arl.add("Apple");   
//		arl.add("Orange");
//		arl.add("Grapes");
//		arl.add("Mango");
//		arl.add("Guava");
//		arl.add("Mango");
//
//		List<String> syncCollection = Collections.synchronizedList(arl);
//
//		List<String> upperList = new ArrayList<>(); //New List
//    
//		Runnable listOperations = () -> 
//		{
//			synchronized (syncCollection) 
//			{
//               syncCollection.forEach(str -> upperList.add(str.toUpperCase()));           
//           }
//       };
//
//	   Thread t1 = new Thread(listOperations);
//	   t1.start();
//	   System.out.println(upperList);
//      upperList.forEach(x -> System.out.println(x));
//	}
//}


public class TraditionalDrawback {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<>();
		al.add("sunday");
		al.add("monday");
		al.add("tuesday");
		al.add("wednesday");
		List<String> syncList=Collections.synchronizedList(al);
		List<String> newList=new ArrayList<>();
		Runnable listOperation =new Runnable() {

			@Override
			public void run() {
				synchronized(syncList) {
					syncList.forEach(str-> newList.add(str.toUpperCase()));
				}	
			}
		};
		new Thread(listOperation).start();
		System.out.println(newList);
		//newList.forEach(t->System.out.println(t));
	}

}
