package regularclass;

public class Test {
	public static void main(String[] args) {
		Vechicle bike=new Vechicle("StreetTriple", "765",1000000d,11250);
		bike.vechicleStart();
		bike.vechicleStop();
		System.out.println(bike);
	}
}
