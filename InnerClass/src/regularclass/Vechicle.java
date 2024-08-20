package regularclass;

public class Vechicle {
	private String name;
	private String model;
	private Double price;
	
	private Engine eng;			//has a 
	
	public Vechicle(String name, String model, Double price, Integer bhp) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.eng = new Engine(bhp);
	}

	private class Engine{
		private Integer bhp;
		private Engine(Integer bhp) {
			this.bhp=bhp;
		}
		
		public void start() {
			System.out.println("Engine started");
		}
		
		public void stop() {
			System.out.println("Engine stoped");
		}
		
	}
	
	public void vechicleStart() {
		this.eng.start();
		System.out.println("Vechicle started");
	}
	public void vechicleStop() {
		this.eng.stop();
		System.out.println("Vechicle stoped");
	}
	@Override
	public String toString() {
		return "Vechicle [name=" + name + ", model=" + model + ", price=" + price + ", bhp=" + eng.bhp + "]";
	}
	
	
	
}
