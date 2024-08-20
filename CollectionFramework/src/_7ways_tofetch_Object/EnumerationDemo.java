package _7ways_tofetch_Object;
import java.util.Enumeration;
import java.util.Vector;
public class EnumerationDemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("Mango");
		v.add("Apple");
		v.add("Grapes");
		v.add(2,"Banana");
		//to fetch object from collection
		Enumeration<String> fruits=v.elements();		//enumeration is cursor
		while(fruits.hasMoreElements()) {
			System.out.println(fruits.nextElement());
			}
		
		
	}

}
