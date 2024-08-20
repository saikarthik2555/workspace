package linkedList;

import java.util.ArrayList;

public class SortedSetDemo {
	public static void main(String[] args) {
		ArrayList<Product> a=new ArrayList<>();
		a.add(new Product(3, "Camera", 45000d));
		a.add(new Product(2, "mobile", 25000d));
		a.add(new Product(1, "TV", 55000d));
		a.sort((p1,p2)-> p1.getPid()-p2.getPid());
		
		System.out.println(a);

	}

}
