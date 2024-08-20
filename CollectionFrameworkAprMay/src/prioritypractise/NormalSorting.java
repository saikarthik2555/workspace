package prioritypractise;

import java.util.ArrayList;

public class NormalSorting {
	public static void main(String[] args) {
		ArrayList<String> god=new ArrayList<String>();
		god.add("Vishnu");
		god.add("Brahma");
		god.add("Krishna");
		god.add("Hanuman");
		god.add("LakshmiDevi");
		god.add("SaraswathiDevi");
		god.add("Shiva");
		god.add("Sai");
		god.sort((str1,str2)-> str1.compareTo(str2));
		System.out.println(god);
	}

}
