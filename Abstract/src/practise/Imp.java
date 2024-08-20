package practise;

public class Imp extends Test{

	public Imp(Integer a, String name,String name1) {		//single inheritance 
		super(a, name,name1);
		
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstract Overriden method");
	}
	
	public static void main(String[] args) {
		Test.staticmethod();
		Test t1=new Imp(12,"sai","karthik");	//upcasting because we cannot create obj for abstract
		t1.nonstaticmethod();
		t1.abstractMethod();
		System.out.println(Test.name1);
		System.out.println(t1.a);
		System.out.println(t1.name);
	}

}
