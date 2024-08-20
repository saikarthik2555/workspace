package covarient;

public class Child extends Parent{
	
	@Override
	public Car getData() {
		System.out.println("Child");
		return new Car();
	}
	

}
