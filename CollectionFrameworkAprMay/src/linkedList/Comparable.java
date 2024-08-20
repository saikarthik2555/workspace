package linkedList;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Comparable {
	public static void main(String[] args) {
				List<Employee> l=new Vector<>();
				l.add(new Employee(12, "Smith"));
				l.add(new Employee(7,"Ford"));
				l.add(new Employee(18, "John"));
				l.add(new Employee(2, "Clerk"));
//				Comparable cmp=new Comparable<Employee>() {
//					@Override
//					public int compareTo(Employee emp) {	//comparable not supporting
														//annonymous approach
//						return 0;
//					}
//				};
				Collections.sort(l);
				System.out.println(l);
			}

		}