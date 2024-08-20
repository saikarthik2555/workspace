package covarient;

public class Test {
	public static void main(String[] args) {
//		Child p=new Child();
//		Car c=p.getData();
		
		Parent p=new Child();
		Car c=(Car)p.getData();
	}

}
