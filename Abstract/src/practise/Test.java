package practise;

public abstract class Test {
	int a;
	String name;
	static String name1;
	
	public Test(Integer a,String name,String name1) {
		this.a=a;
		this.name=name;
		this.name1=name1;
	}
	
	{
		System.out.println("Non-static block");
	}
	static {
		System.out.println("static block");
	}
	
	public static void staticmethod() {
		System.out.println("Static method");
	}
	
	public void nonstaticmethod() {
		
		System.out.println("Non-static method ");
	}
	
	public abstract void abstractMethod();

}
