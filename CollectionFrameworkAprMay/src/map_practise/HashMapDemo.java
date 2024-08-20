package map_practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(null, "A");
		hm.put(null, "B");
		hm.put(1, "C");
		hm.put(2, "D");
		Set<Entry<Integer, String>> s=hm.entrySet();
		for(Map.Entry<Integer,String> i: hm.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue()+" "+i.setValue(null));
			
		}
	}
}
