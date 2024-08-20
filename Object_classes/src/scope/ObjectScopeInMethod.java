package scope;

public class ObjectScopeInMethod {
	public static void main(String[] args) {
		new ObjectScopeInMethod().get();
		//m.
	}
	public void get() {
		ObjectScopeInMethod m=new ObjectScopeInMethod();
		//when a obj created with in the method then the scope is up to the method
		m.hashCode();
		m.toString();
	}

}


