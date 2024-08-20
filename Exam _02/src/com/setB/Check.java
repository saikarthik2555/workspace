package com.setB;

@FunctionalInterface
interface Invisible {
	public void show();
}

class Display implements Invisible {
	Invisible inv;
	public void show() {
		inv = () -> System.out.println("I am Visible");
	}
}

public class Check {
	public static void main(String[] args) {
        new Display().show();
	}
}