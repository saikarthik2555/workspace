package concreate_default;

public class Child1 implements Parent1{
	@Override
	public void m1() {
		System.out.println("m1 method from Child1");
	}
	@Override
	public void show1() {
		System.out.println("Default method from Parent1 ");
	}

	public static void method() {
		System.out.println("static method from child1");
	}

}
