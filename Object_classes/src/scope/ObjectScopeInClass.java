package scope;

public class ObjectScopeInClass {
	Integer i=new Integer(100);						
	//When a obj is created as an instance variable then the scope is 
	//in the other class object scope
	public static void main(String[] args) {
		ObjectScopeInClass obj=new ObjectScopeInClass();
		obj.get();
		obj.set();
		obj=new ObjectScopeInClass();
		obj.set();
	
	}
	public void get() {
		i=new Integer(12);
	}
	
	public void set() {
		System.out.println(i.toString());
	}
	
}
