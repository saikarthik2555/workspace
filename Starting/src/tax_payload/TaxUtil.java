package tax_payload;

public class TaxUtil {
	double tax;
	public double calculateTax(Employee emp) {
		if(emp.calculateGrossSalary()>5000) {
			return emp.calculateGrossSalary()*0.2;
		}
		else {
			return emp.calculateGrossSalary()*0.05;
		}
		//return tax;
	}
	public double calculateTax(Manager mng) {
		if(mng.calculateGrossSalary()>5000) {
			tax=mng.calculateGrossSalary()*0.2;
		}
		else {
			tax=mng.calculateGrossSalary()*0.05;
		}
		return tax;
		
	}
	public double calculateTax(Trainer t) {
		if(t.calculateGrossSalary()>5000) {
			tax=t.calculateGrossSalary()*0.2;
		}
		else {
			tax=t.calculateGrossSalary()*0.05;
		}
		return tax;
		
	}
	public double calculateTax(Sourcing s) {
		if(s.calculateGrossSalary()>5000) {
			tax=s.calculateGrossSalary()*0.2;
		}
		else {
			tax=s.calculateGrossSalary()*0.05;
		}
		return tax;
		
	}

}
