package practise_july;

import java.util.ArrayList;

public class RecordImp {
	public static void main(String[] args) {
		//Sample s=new Sample(12, "snam");
		  ArrayList<String> al3=new ArrayList<>();
		  al3.add("Ravi");
		  al3.add("Rahul");
		  al3.add("Rohit");		  
		  
		  ArrayList<String> al4=new ArrayList<>();
		  al4.add("Pallavi");
		  al4.add("Rahul");
		  al4.add("Raj");
		  
		  al3.retainAll(al4);
		  System.out.println(al3.toString());
		}

}
