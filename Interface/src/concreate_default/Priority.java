package concreate_default;

public class Priority {
	public static void main(String[] args) {
		Parent1 p=new Child1();
		p.m1();
		p.show1();
		Parent1 p1=new Child1();
		System.out.println(p instanceof Parent1);
		System.out.println(p instanceof Child1);
		Parent1.method();		
		
		Child1 c1=new Child2();
		c1.m1();
		c1.show1();
		//Child1.check();
		//c1.check();		//static method not present in Child1
		Child2 k=new Child2();
		k.check();
	}
}
