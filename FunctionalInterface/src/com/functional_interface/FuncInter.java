package com.functional_interface;

@FunctionalInterface
interface Vechicle{
	public abstract void run();
}
														//not sure 
public class FuncInter{
	public static void main(String[] args) {
		Vechicle car=new Vechicle() {  			//we can't create object for Interface 
			@Override							//  doubt
			public void run() {
				System.out.println(" Car is Running ");
			}
		};
		car.run();
		String name="Riya";
		System.out.println(name.startsWith("R"));
	}

}
