package staticmethod;

public class Check {
	public static void main(String[] args) {
		run();
		
	}
	public static void run() {
		System.out.println("Running");
	}

}
abstract class Demo{
	
	public void get() {
	}
	
	//protected abstract  static  void show();
}

class Child extends Demo {

	public void show() {
		
	}
	
}