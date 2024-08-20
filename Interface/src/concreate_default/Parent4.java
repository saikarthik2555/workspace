package concreate_default;

public interface Parent4 {
	public abstract void m1();
	public default void show1() {
		System.out.println("Default method from Parent4 ");
	}
	
	public static void method() {
		System.out.println("static method from Interface");
	}
	

}
