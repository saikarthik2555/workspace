package com.sample;

public class Sample1 {
	public static void main(String[] args) {
		Check c=new Do();
		c.getData();
	}

}
abstract class Check{
	public abstract void work();
	public void getData() {
		System.out.println("Today is Sat");
	}
}
class Do extends Check{

	@Override
	public void getData() {
		System.out.println("when obj created for sub then that sub class method more priority");
	}

	@Override
	public void work() {
		System.out.println("working Method");
	}
}