
package Strings;

import java.util.Arrays;

public class SortDemo {
public static void main(String[] args) {
	int data[]= {9,6,7,8,0,8,5,3,3};
	Arrays.sort(data);
	for(int e : data) {
		System.out.print(e+" ");
	}
	System.out.println(Arrays.toString(data));
}	

}
