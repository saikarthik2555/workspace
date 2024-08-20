package private_methods;

public class Test2 {
		public static void main(String[] args) {
			
			Test1 t1=new Test1() {
				@Override
				public void Common() {
					System.out.println("Common method from Interface");
				}
			};
			t1.check();
		  //t1.Static1();	//error	This static method of interface Test1 can only be accessed as Test1.Static1
		}
}
