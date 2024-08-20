package com.prg.sealedprgms;

public class Dog extends GeorgePig{				//non-sealed class can extended by any class
public static void main(String[] args) {
	GeorgePig gp=new Dog();
	gp.roll();
}
}
