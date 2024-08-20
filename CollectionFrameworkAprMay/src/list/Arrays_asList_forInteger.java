package list;

import java.util.Arrays;
import java.util.List;

public class Arrays_asList_forInteger {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(5456,2,1,3,4,21,1,2,3,4,543,2,3,4,35);
		lst.sort((i1,i2)-> i1-i2);
		lst.forEach(t-> System.out.print(t+" "));		//ascending
		System.out.println();
		lst.sort((i1,i2)-> -(i1.compareTo(i2)));
		lst.forEach(i-> System.out.print(i+" "));		//descending
	}
}
