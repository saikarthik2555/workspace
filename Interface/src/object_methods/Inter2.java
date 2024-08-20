package object_methods;

@FunctionalInterface
public interface Inter2 {
	
	public abstract void get();				//abstract method
	
	public default void wishes() {						//default method
		System.out.println("Have a Nice Day Inter2");
	}
	
	public static String time() {							//static method
		return "Today is 10-July-2024. First day of my Institute";
	}
}
