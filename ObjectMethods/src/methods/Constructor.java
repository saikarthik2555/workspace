package methods;

public class Constructor extends Object{
	public static void main(String[] args) throws InterruptedException {
		Object obj=new Object();	//no argument constructor
		System.out.println(obj.hashCode());
		
		Object obj2=new Constructor();
		System.out.println(obj2.hashCode());		//parent deligation
		}
	@Override
	public  int hashCode() {
		return 10025;
	}

}
