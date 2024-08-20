package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Students> lst=new ArrayList<Students>();
		lst.add(new Students(12, "smith", 1200));
		lst.add(new Students(1, "ford", 1000));
		lst.add(new Students(15,"john", 500));
		lst.add(new Students(7, "clerk", 700));
	//	Collections.sort(lst);			//confused
		Comparator<Students> cmp=(stud1,stud2)-> stud1.id()-stud2.id();
	//	Collections.sort(lst, cmp);
		lst.sort(cmp);				//another way using List
		System.out.println(lst);
		
	}

}
