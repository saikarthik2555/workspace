package com.singleton_class;


public class Test{
	static Test ref;
	private Test() {		//private constructor
		//System.out.println(ref.hashCode());
	}
	public static Test getObject() {
		if(ref==null)
			ref=new Test();
		return ref;
	}
	public static void main(String[] args) {
		Test.getObject();
		System.out.println(new Test().getObject().hashCode());
		System.out.println(new Test().getObject().hashCode());
		
	}
}






















////We should declare a constructor as private when that class contain only static method as well as 
////when we want to create only one object for that class.
//
//public class Test {
//	private Test() {			//public//protected//private
//								//we cannot define static final
//		System.out.println("Private Constructor ");
//	}
////	public static void main(String[] args) {
////		Demo t1=new Demo();
////		Demo t2=new Demo();
////		t1.getData();
////		t2.getData();
////		System.out.println(t1.a);
////	}
//	
//}
