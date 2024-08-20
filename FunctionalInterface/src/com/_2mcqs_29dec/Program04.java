package com._2mcqs_29dec;
@FunctionalInterface
interface Readable{
	String name="The Strange";
public abstract Readable read();
}
class Book implements Readable{
	Readable r; 
		public Readable read() {
			r= () -> {System.out.println(r.name);
			return r;
			};				// System.out.println(r.read().name);
			return r;	//here name is variable 
	}
}

public class Program04 {
public static void main(String[] args) {
	System.out.println(new Book().read().read().name);
	
}
}

