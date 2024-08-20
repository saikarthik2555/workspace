package private_methods;

public interface Parent1 {
	public static final String name="sai";
	public abstract void surName();
	private static void NonStatic() {
		System.out.println("I am your Parent1");
	}
	public static void Static() {
		NonStatic();
	}

}
