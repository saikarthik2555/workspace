package com.sample;

public interface HotDrink {
	public abstract void prepare();

}

class Tea implements HotDrink{
	@Override
	public void prepare() {
		System.out.println("Preparing Tea");
	}
}
class Coffee implements HotDrink{
	@Override
	public void prepare() {
		System.out.println("Preparing Coffee");
	}
}
class Boost implements HotDrink{
	@Override
	public void prepare() {
		System.out.println("Boost Preparing");
	}
}
