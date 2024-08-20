package sample;

public class Test{
	public static void main(String[] args) {
		Employee emp=new Employee(123, "Smith", 7894567894L);
		System.out.println(emp.hashCode());
		Employee emp1=new Employee(123,"Smith",123456789L);
		System.out.println(emp.equals(emp1));
		System.out.println("====================================");
	    EmployeeRecord er=new EmployeeRecord(567, "Ford", 2323232L);
	    EmployeeRecord er1=new EmployeeRecord(567,"Ford",2323232L);
	    System.out.println(er.hashCode());
	    System.out.println(er.getClass());
	    System.out.println(er1.getClass());
	    System.out.println(er.equals(er1));
	    
	    
	}
}