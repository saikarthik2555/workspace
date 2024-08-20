package practise_july;

import java.util.ArrayList;

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<>();
		ar.add("tuesday");
		ar.add("wednesday");
		ar.add("friday");
		ar.add("monday");
		ar.add("sunday");
		ar.add("thursday");
		ar.sort((str1,str2)  -> str1.compareTo(str2));		
		System.out.println(ar.toString());
		//ar.sort(str1,str2 -> str1.compareTo(str2));
	}

}
