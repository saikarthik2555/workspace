package private_methods;

public interface Parent2 {
	private static void NonStatic() {
		System.out.println("I am your Parent2");	
	}
	public static void Static() {
		NonStatic();
	}
}
