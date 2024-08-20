package non_comparableobjs;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return Integer.compare(p1.getValue(), p2.getValue());
	//	return p1.getValue().compareTo(p2.getValue());
	}

}
