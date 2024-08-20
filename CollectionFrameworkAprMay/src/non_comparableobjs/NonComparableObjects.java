package non_comparableobjs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonComparableObjects {
	public static void main(String[] args) {
		Product p1=new Product(12);
		Product p2=new Product(02);
		Product p3=new Product(1);
		
		List<Product> ls=new ArrayList<Product>();
		ls.add(p1);
		ls.add(p2);
		ls.add(p3);
		Collections.sort(ls,new ComparatorDemo());
		System.out.println(ls.toString());
		
		
	}
}
