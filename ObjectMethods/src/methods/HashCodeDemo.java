package methods;

public class HashCodeDemo extends Object{

	@Override
	protected java.lang.Object clone(){
		
		return new HashCodeDemo();
	}
	public static void main(String[] args) {
		HashCodeDemo h=new HashCodeDemo();
		System.out.println(h.hashCode());				//reference variable
		System.out.println(h.hashCode());				//reference variable
		System.out.println(new HashCodeDemo());			//anonymous obj
		HashCodeDemo d=(HashCodeDemo)new HashCodeDemo().clone();	//upcasting
		System.out.println("Clone obj"+d.hashCode()); 			//for clone different HashCode
		System.out.println(new HashCodeDemo());				//anonymous obj
		System.out.println("Clone Obj"+new HashCodeDemo().hashCode());	//for clone different HashCode
		System.out.println(new HashCodeDemo().toString());		//anonymous obj
	}

}
