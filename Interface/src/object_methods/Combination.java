package object_methods;

public class Combination {
	public static void main(String[] args) {
		Inter3 in=new Inter3() {
			public int hashCode() {
				return 12;
			}
		};		
		in.hashCode();
	}
}
