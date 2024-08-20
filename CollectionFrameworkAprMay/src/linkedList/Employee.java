package linkedList;

public record Employee(Integer id,String name) implements java.lang.Comparable<Employee>{

	@Override
	public int compareTo(Employee emp) {
		System.out.println("Executed "+this.id+"    "+emp.id);
		return this.id.compareTo(emp.id);
	}

}
