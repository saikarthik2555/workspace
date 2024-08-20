package sortedset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		
		NavigableSet<Double> ns = new TreeSet<>(); 
        ns.add(1.02);
        ns.add(2.98);
        ns.add(3.65);
        ns.add(4.50);
        ns.add(5.5);
        ns.add(6.49);

		System.out.println("lower(3): " + ns.lower(4.01));
		System.out.println("lower(3): " + ns.lower(3.51));
		System.out.println("lower(3): " + ns.lower(3.98));
		System.out.println("lower(3): " + ns.lower(3.01));
		System.out.println("lower(3): " + ns.lower(3d)+"\n");
		
		System.out.println("higher(3): " + ns.higher(3.01));
		System.out.println("higher(3): " + ns.higher(3.49));
		System.out.println("higher(3): " + ns.higher(3.51));
		System.out.println("higher(3): " + ns.higher(3.99));
		System.out.println("higher(3): " + ns.higher(3d)+"\n");
		
		System.out.println("floor(3): " + ns.floor(3.01));
		System.out.println("floor(3): " + ns.floor(3.49));
		System.out.println("floor(3): " + ns.floor(3.51));
		System.out.println("floor(3): " + ns.floor(3.99));
		System.out.println("floor(3): " + ns.floor(3d)+"\n");
		
		System.out.println("ceiling(3): " + ns.ceiling(3.01));
		System.out.println("ceiling(3): " + ns.ceiling(3.49));
		System.out.println("ceiling(3): " + ns.ceiling(3.51));
		System.out.println("ceiling(3): " + ns.ceiling(3.99));
		System.out.println("ceiling(3): " + ns.ceiling(3d));
    		

	}

}
