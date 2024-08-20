package concreate_default;

public interface Parent1 {
	public abstract void m1();
	
	public default void show1() {
		System.out.println("Default method from Parent1 ");
	}
	public static void method() {
		System.out.println("static method from Interface");
	}
}
