package properties_demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public sealed class Demo permits Sample{
	public static void main(String[] args) {
		Properties p=System.getProperties();
		Set<Entry<Object, Object>> s=p.entrySet();
		Iterator<Map.Entry<Object, Object>> i=s.iterator();
		while(i.hasNext()) {
				Map.Entry<String, String> obj=(Map.Entry)i.next();
				System.out.println(obj.getKey()+"\t\t\t\t"+obj.getValue());
		}	
	}
}
non-sealed class Sample extends Demo{
	
}