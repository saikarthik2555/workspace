package p1;

import com.prg.acessmodifiers.Example;

public class Sample {
	public static void main(String[] args) {
		Example e=new Example();
		//System.out.println(e.b);//within package
		System.out.println(e.c);
		//System.out.println(e.d);//protected - within package or call by subclass obj
		
	}
}
