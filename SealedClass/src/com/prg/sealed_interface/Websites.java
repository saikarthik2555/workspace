package com.prg.sealed_interface;

public non-sealed class Websites implements Land{

	@Override
	public void price() {
		System.out.println(Land.phno +"  for more details : visit ");
		System.out.println("Our Realestate class");
	}

	@Override
	public void area() {
		System.out.println("visit : https://www.myhomeavatar.com");
	}

}
