package regularclass;

public final class University {
	private static String Uname;
	
	
	public University(String Uname) {
		this.Uname=Uname;
	}
	
	private void displayUniversity() {
		System.out.println("University : "+Uname);
	}
	protected class Department{
		public Department() {
			
		}
		private String dName;
		private Integer seats;
		private String faculty;
		public Department(String dName, Integer seats, String faculty) {
			super();
			this.dName = dName;
			this.seats = seats;
			this.faculty = faculty;
		}
		
		public void displayDepartment() {
		System.out.println("Department [dName=" + dName + ", seats=" + seats + ", faculty=" + faculty + "]");
		displayUniversity();
		}
		
			
			protected class Student{
				private Integer rollNo;
				private String name;
				private String address;
				public Student(Integer rollNo, String name,String address) {
					super();
					this.rollNo = rollNo;
					this.name = name;
					this.address = address;
				}
				@Override
				public String toString() {
					return "Student [rollNo=" + rollNo + ", name=" + name + ", department=" + dName + ", address="
							+ address + " University "+ Uname+"]";
				}		
				
				
				
			}//student
	}//department
}//University
