package com._2mcqs_29dec;

@FunctionalInterface
interface Readablee {
	String name = "The Stranger";

	public Readablee read();
}

class Bookk implements Readablee {
	Readablee r ;

	@Override
	public Readablee read() {
		r = () -> {
			System.out.println(Bookk.name);
			return this;
		};
		return r;
	}

}

public class Program05 {
	public static void main(String[] args) {
		Bookk b1 = new Bookk();
        b1.read();
	}
}