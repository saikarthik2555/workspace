package com.prg.sealed_interface;

public sealed interface Land permits Websites,Realestate{
	public static long phno=6302526312L;
	public static final int pricepersq=10000;
	public abstract void price();
	public abstract void area();
}
