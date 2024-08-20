package tax_payload;

public class Employee {
	private int empId;
	private String empName;
	private double basicSalary;
	private double hRAper;
	private double dAper;
	public Employee(int empId, String empName, double basicSalary, double hRAper, double dAper) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.hRAper = hRAper;
		this.dAper = dAper;
	}
	public double calculateGrossSalary() {
		return basicSalary+hRAper+dAper;
		}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", hRAper="
				+ hRAper + ", dAper=" + dAper + "]";
	}
	
	

}
