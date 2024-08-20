package staticnestedclass;

public class Test {
	
		public static void main(String args[])
		{  
			Outer ou=new Outer();
				
			//new Outer.Inner().msg();
		 //new Outer.Inner().msg();
		//new Outer.Inner().msg();
			
			System.out.println(Outer.Inner.msg());
			new Outer.Inner().msg1();
			
		}  
	}  
class Outer
{  
	public Outer get() {
		return new Outer();
	}
	public Outer() {
		System.out.println("Outer class constructor invoked");
	}
	   static int x=15;  

	   static class Inner
	  {  
		   public Inner() {
			   System.out.println("Inner class Constructro invoked");
			   
		   }
			public static int msg()
				{
					System.out.println("x value is  "+x);
					return 0;
				}  
			public  void msg1()
			{
				System.out.println("x value is  "+x);
			}  
	  }
}
