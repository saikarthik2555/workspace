package com.List.Vector;

import java.util.Vector;

public class MethodsOfVector {
	public static void main(String[] args) {
		//if we create LinkedList as 
		//List<String> lst=new LinkedList<>();
		//Many mathods are not accessible because those belongs to LinkedList only
		Vector<String> v=new Vector<>();
		v.add("12");
		v.add("34");
		v.add("56");
		v.add("78");
		v.add(2, "20");
		v.setElementAt("20", 3);
		System.out.println(v);
		System.out.println(v.indexOf("12", 3)); 
		
		String o[]=new String[4];							//powerfull method
		String []a=v.toArray(o);
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}															
		
/*		v.trimToSize();  //makes capacity as size
		System.out.println(v.capacity()+" 4 size 4 capacity");			*/
		
/* 		to remove range elements
		System.out.println(v.removeAll(v.subList(1, 4)));
		System.out.println(v);									*/
		
//		System.out.println(v.removeElement("56")); 
//		System.out.println(v.remove(0));
		
/*		public List subList(int starting, int UPTO index)
 * 		List v1=v.subList(1, 4);
		System.out.println(v1);								*/

/*		System.out.println(v.set(1, 100));
		v.setElementAt(300, 3);						//powerful
		v.insertElementAt(200, 2);
		System.out.println(v);								*/
		
/* 		public java.util.Enumeration elements();		
		System.out.println(v.elements());				*/
		
		
/*		public E elementAt(int);
		System.out.println(v.elementAt(2));
		System.out.println(v.firstElement());				//like peek in LinkedList
		System.out.println(v.lastElement());
		System.out.println(v.get(2));      				*/
		
//		public void copyInto(Object []);			*/	
		String arr[]=new String[v.size()];	
		v.copyInto(arr); 		//powerfull	
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);							
		}
		}
		
	}


