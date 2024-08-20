package list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ComparableDemo {
	public static void main(String[] args) {
		List<Integer> l=new Vector<>();
		l.add(12);
		l.add(15);
		l.add(56);
		l.add(1);
		l.add(67);
		l.add(23);
		l.add(8);
		Collections.sort(l);							//default natural sorting order
		
		List<Product> ls=new Vector<>();
		ls.add(new Product(7, "Laptop", 40000));
		ls.add(new Product(14, "Cooler", 7000));
		ls.add(new Product(2, "Fridge", 15000));
		ls.add(new Product(12, "Tv", 25000));
		System.out.println(ls);
		Collections.sort(ls,(prod1,prod2)-> prod1.id()-prod2.id()); 
		System.out.println(ls);
	}


}
record Product(int id,String name,double price){
	
}