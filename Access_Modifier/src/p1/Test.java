package p1;

import com.prg.acessmodifiers.Example;

public class Test extends Example{
	public static void main(String[] args) {
		Example a=new Example();
		//	System.out.println(a.a);		private
		//	System.out.println(a.b);		default
			System.out.println(a.c);	//	public 
		//	System.out.println(a.d);		protected only within package and subclass
			
			Test t=new Test();
		//	System.out.println(t.a);			private
		//	System.out.println(t.b);			default
			System.out.println(t.c);		//	public
			System.out.println(t.d);		//	protected
	}

}
