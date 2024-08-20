package object_methods;

public class Child implements Parent{
	@Override
	public  String toString() {
		
		return "modified method";
	}
	
	@Override
	public  boolean equals(Object obj) {
		
		return true;
	}
	
	@Override
	public  int hashCode() {
		
		return 12;
	}
	
}
