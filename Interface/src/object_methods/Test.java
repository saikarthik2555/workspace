package object_methods;

public class Test {
	public static void main(String[] args) {
		I i=null;
		i.equals(i);							//from Object class
		System.out.println(i.equals(i));
	}
}
interface I{
	public  static String to() {		//toString error
	//	This static method cannot hide the instance method from Object
		return "rdhd"+"ger";
	}
	
}
class Test2 implements I{
	
}