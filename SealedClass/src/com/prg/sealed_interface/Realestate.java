package com.prg.sealed_interface;

public final class Realestate implements Land{

	@Override
	public void price() {
		System.out.println("Square ft. "+Land.pricepersq);
	}

	@Override
	public void area() {
		System.out.println("visit : 'https://www.myhomeavatar.com' ");
	}

}
