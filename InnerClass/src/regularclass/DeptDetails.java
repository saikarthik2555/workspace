package regularclass;

public class DeptDetails {
	public static void main(String[] args) {
		University u=new University("JNTUH");
		University.Department.Student s1=u.new Department("Computer Science",120, "Swetha").new Student(1, "Smith", "Ameerpet");
		University.Department.Student s2=u.new Department("Electronics and Communication", 120, "Shraven").new Student(2, "John", "Secunderabad");
//		cse.displayDepartment();
//		ece.displayDepartment();
		
		System.out.println(s1);
		System.out.println(s2);       //inner inner 
	
	}
}
