package tax_payload;

public class Trainer {
	private int tId;
	private String tName;
	private double basicSalary;
	private double hRAper;
	private double dAper;
	private int batchCount;
	private double perkPerBatch;
	public Trainer(int tId, String tName, double basicSalary, double hRAper, double dAper, int batchCount,
			double perkPerBatch) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.basicSalary = basicSalary;
		this.hRAper = hRAper;
		this.dAper = dAper;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	public double calculateGrossSalary() {
		return basicSalary+hRAper+dAper+(batchCount*perkPerBatch);
	}
	@Override
	public String toString() {
		return "Trainer [tId=" + tId + ", tName=" + tName + ", basicSalary=" + basicSalary + ", hRAper=" + hRAper
				+ ", dAper=" + dAper + ", batchCount=" + batchCount + ", perkPerBatch=" + perkPerBatch + "]";
	}
	
}
