package scope;

public class ObjectScopeForStatic {
	static Integer i=new Integer(42);
	//when an object created as static variable then the scope is within the other class scope
	public static void main(String[] args) {
		i.compareTo(i);
	}
	public void get() {
		i.intValue();
	}
	
	public void set() {
		i.valueOf(0);
	}
	

}
