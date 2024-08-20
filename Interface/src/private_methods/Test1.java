package private_methods;

public interface Test1 {
	/*
	 * 1) An interface abstract method cannot be private
	 * 2) A private static method can be used in inside static and non-static method(default method)
	 * 3) A non-static private method cannot be used in static method
	 * 4) private methods can be used only inside Interface
	 */
	
	public  abstract void Common();										//(1)
	
	public default void check() {
		Static();														//(2) 
		NonStatic();													//(3)
	}
	
	private static void Static() {
		System.out.println("private static method ");
		// NonStatic;	//error			(3)
	}
	
	private void NonStatic() {
		Static();														//(2)
		System.out.println("private Non-static method");
		Static1();
	}
	
	public static void Static1() {
		System.out.println("public Static method");
	}
}
