package list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Students> al=new ArrayList<Students>();
		al.add(new Students(1, "smith", 1200));
		al.add(new Students(2, "ford", 1000));
		al.add( new Students(3,"John",1400));
		
		ArrayList<Students> nal=new ArrayList<Students>();
		nal.add(new Students(1, "smith", 1200));
		nal.add(new Students(2, "fordd", 1000));
		nal.add( new Students(3,"John",14000));
		
		//nal.retainAll(al);		//common and matching
		al.retainAll(nal);			//matching
		al.forEach(stu-> System.out.println(stu));
	}
}
