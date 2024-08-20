package method_localinnerclass;

public class Outer{
	private String name="outer";
	
	public void outerMethod(){
		 String name="inner";
		 class Inner{
			 private Integer a=12;
			 public void show() {
				 System.out.println(Outer.this.name);		
				 System.out.println(name);
				 System.out.println(a);
			 }
		}//inner
		 new Inner().show();
	}//method
}//outer
