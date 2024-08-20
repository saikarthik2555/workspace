package practise_july;

import java.util.ArrayList;
import java.util.Collections;
public class Test extends ArrayList<String>{
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>(5);
		ar.add("one"); 
		ar.add("two");
		ar.add("three");
		ar.add("our");
		
		ArrayList<String> lc=new ArrayList<String>(ar);
		lc.add("ive");
		System.out.println(lc.size());
		System.out.println(lc.get(2));
		System.out.println(lc.indexOf("ive"));
		ar.sort(null);
		Collections.sort(lc);		//
		System.out.println(lc.toString());
	}
}
