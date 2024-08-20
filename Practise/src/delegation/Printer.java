package delegation;

public class Printer {
	public Printer() {
		super();
		System.out.println("Printer constructor");
	}
	RealPrinter r=new RealPrinter();
	
	public void print() {
		r.print();          
	}

}
