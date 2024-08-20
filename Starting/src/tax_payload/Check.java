package tax_payload;

public class Check {
	public static void main(String[] args) {
		TaxUtil tax=new TaxUtil();			//tax
		
		Employee emp=new Employee(1, "Smith", 3700, 200, 1400);		//employee
		System.out.println("Details of "+emp+" with tax "+tax.calculateTax(emp));
		Manager mng=new Manager(2, "Ford", 4000, 300, 1600, 350);	//manager
		System.out.println("Details of "+mng+" with tax "+tax.calculateTax(mng));
		Trainer t=new Trainer(3, "Jones", 2300, 150, 200, 7, 50);	//trainer
		System.out.println("Details of "+t+" with tax "+tax.calculateTax(t));
		Sourcing s=new Sourcing(4, "Dom", 4000, 200, 100, 500, 12, 7);
		System.out.println("Details of "+s+" with tax "+tax.calculateTax(s));
		
	}

}
