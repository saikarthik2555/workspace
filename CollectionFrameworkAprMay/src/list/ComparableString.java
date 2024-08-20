
package list;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ComparableString {
	public static void main(String[] args) {
		List<String> l=new Vector<>();
		l.add("sunday");
		l.add("monday");
		l.add("tuesday");
		l.add("wednesday");
		l.add("thursday");
		l.add("friday");
		l.add("saturday");
		System.out.println(l);
//		Comparable<String> cm=new Comparable<>() {
//
//			@Override
//			public int compareTo(String str) {
//			
//				return str.compareTo(str);
//			}
//			
//		};
		Collections.sort(l);
		System.out.println(l);
	}

}
record StringDemo(String name) implements Comparable<String>{

	@Override
	public int compareTo(String str) {
		return this.name.compareTo(str);
	}
	
}