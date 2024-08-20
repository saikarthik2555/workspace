package staticnestedclass;

public class Test1
{  
	public static void main(String args[])
	{  
		Outerr.Innerr.msg();
	}  
}  

class Outerr    
{  
	public Outerr() {
		System.out.println("Outter");
	}
	  static int x = 25;  
	  
	  public static class Innerr 
	  {  
		  public Innerr() {
			  System.out.println("Inner ");
		  }
			static void msg()
				{
		System.out.println("x value is  "+x);		
				}		
	  }	  
}
