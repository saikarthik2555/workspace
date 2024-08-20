package tax_payload;

public class Sourcing {
	private int sId;
	private String sName;
	private double basicSalary;
	private double hRAper;
	private double dAper;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	public Sourcing(int sId, String sName, double basicSalary, double hRAper, double dAper, int enrollmentTarget,
			int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.basicSalary = basicSalary;
		this.hRAper = hRAper;
		this.dAper = dAper;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	public double calculateGrossSalary() {
		return basicSalary+hRAper+dAper+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
	}
	@Override
	public String toString() {
		return "Sourcing [sId=" + sId + ", sName=" + sName + ", basicSalary=" + basicSalary + ", hRAper=" + hRAper
				+ ", dAper=" + dAper + ", enrollmentTarget=" + enrollmentTarget + ", enrollmentReached="
				+ enrollmentReached + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}
	

}
