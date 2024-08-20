package com.concurrent_collection;

class Fruit<E>{
	
}
class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
		
	}
}
class Mango extends Fruit{
	@Override
	public String toString() {
		return "Mango";
	}
}
class Basket<Q>{
	private Q element;
	public void setElement(Q element) {
		this.element=element;
		}
	public Q getElement() {
		return this.element;
	}
}

public class FruitDownCasting {
public static void main(String[] args) {	
	Basket<Fruit> b1=new Basket<Fruit>();
	b1.setElement(new Apple());
	Apple a=(Apple)b1.getElement();
	
	Basket<Fruit> b2=new Basket<Fruit>();
	b2.setElement(new Mango());
	Mango m=(Mango)b2.getElement();
	System.out.println(a);
	System.out.println(m);
}
}
