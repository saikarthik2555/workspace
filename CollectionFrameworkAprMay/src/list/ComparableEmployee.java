package list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ComparableEmployee {
	public static void main(String[] args) {
		List<Employee> l=new Vector<>();
		l.add(new Employee(12, "Smith"));
		l.add(new Employee(7,"Ford"));
		l.add(new Employee(18, "John"));
		l.add(new Employee(2, "Clerk"));
		Collections.sort(l);
		System.out.println(l);
	}

}
record Employee(int id,String name)implements Comparable<Employee>{

	@Override
	public int compareTo(Employee emp) {
		
		return this.name.compareTo(emp.name);
	}
	
}