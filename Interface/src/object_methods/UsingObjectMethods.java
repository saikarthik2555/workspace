package object_methods;

public class UsingObjectMethods {
	
	public static void main(String[] args) {
		Parent p=new Child();
		System.out.println(p.hashCode());
		System.out.println(p.equals(p));
		System.out.println(p.toString());
	}
}
