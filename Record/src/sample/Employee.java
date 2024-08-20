package sample;

public class Employee {
	private int empid;
	private String empname;
	private Long phno;
	public Employee(int empid, String empname, Long phno) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.phno = phno;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	
	@Override
	public String toString() {
		return empid+" "+empname+" "+phno;
	}
	
	@Override
	public int hashCode() {
		System.out.println(this.getClass());
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			System.out.println("this==obj");
			return true;
		}
		if(obj==null) {
			System.out.println("obj==null");
			return false;
		}
		if(getClass()!=obj.getClass()) {
			System.out.println("getClass()!=obj.getClass()");
			return false;
		}else {
			return true;
		}
		
		
		
//		Employee e=(Employee)obj;
//		if(this.empid==e.empid && this.empname==e.empname) {
//		return true;
//		}
//		else {
//			return false;
//		}
	}

}
