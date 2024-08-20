package tax_payload;

public class Manager {
	private int mngId;
	private String empName;
	private double basicSalary;
	private double hRAper;
	private double dAper;
	private double projectAllowance;
	public Manager(int mngId, String empName, double basicSalary, double hRAper, double dAper,double projectAllowance) {
		super();
		this.mngId = mngId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.hRAper = hRAper;
		this.dAper = dAper;
		this.projectAllowance = projectAllowance;
	}
	public double calculateGrossSalary() {
		return basicSalary+hRAper+dAper+projectAllowance;
	}
	@Override
	public String toString() {
		return "Manager [mngId=" + mngId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", hRAper="
				+ hRAper + ", dAper=" + dAper + ", projectAllowance=" + projectAllowance + "]";
	}
	

}
