package constructor;

public class DefaultThisKeyword {
	public static void main(String[] args) {
		Test t=new Test();
		Test t2=t.Test();
		System.out.println(t2 instanceof Test);
		System.out.println(t2 instanceof Object);
	}
}
//How Constructor giving current Class Obj

class Test{
	public Test() {
		System.out.println("No arg constructor written explicitly");
	}
	
	public Test Test() {
		System.out.println("implicitly constructor giving current class Obj by using this keyword ");
		return this;
	}
}